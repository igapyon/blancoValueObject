/*
 * blanco Framework
 * Copyright (C) 2004-2008 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.valueobject.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.valueobject.BlancoValueObjectConstants;
import blanco.valueobject.BlancoValueObjectMeta2Xml;
import blanco.valueobject.BlancoValueObjectXml2JavaClass;
import blanco.valueobject.message.BlancoValueObjectMessage;
import blanco.valueobject.task.valueobject.BlancoValueObjectProcessInput;

public class BlancoValueObjectProcessImpl implements BlancoValueObjectProcess {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoValueObjectMessage fMsg = new BlancoValueObjectMessage();

    /**
     * {@inheritDoc}
     */
    public int execute(final BlancoValueObjectProcessInput input)
            throws IOException, IllegalArgumentException {
        System.out.println("- " + BlancoValueObjectConstants.PRODUCT_NAME
                + " (" + BlancoValueObjectConstants.VERSION + ")");
        try {
            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new IllegalArgumentException(fMsg.getMbvoja01(input
                        .getMetadir()));
            }

            // �e���|�����f�B���N�g�����쐬�B
            new File(input.getTmpdir()
                    + BlancoValueObjectConstants.TARGET_SUBDIRECTORY).mkdirs();

            new BlancoValueObjectMeta2Xml().processDirectory(fileMetadir, input
                    .getTmpdir()
                    + BlancoValueObjectConstants.TARGET_SUBDIRECTORY);

            // XML�����ꂽ���^�t�@�C������ValueObject�𐶐�
            // �ŏ��Ƀe���|�����t�H���_�𑖍�
            final File[] fileMeta2 = new File(input.getTmpdir()
                    + BlancoValueObjectConstants.TARGET_SUBDIRECTORY)
                    .listFiles();
            for (int index = 0; index < fileMeta2.length; index++) {
                if (fileMeta2[index].getName().endsWith(".xml") == false) {
                    continue;
                }

                final BlancoValueObjectXml2JavaClass xml2JavaClass = new BlancoValueObjectXml2JavaClass();
                xml2JavaClass.setEncoding(input.getEncoding());
                xml2JavaClass.setXmlRootElement(input.getXmlrootelement());
                xml2JavaClass.process(fileMeta2[index], new File(input
                        .getTargetdir()));

                // �P�̎����R�[�h�̎��������@�\�� 0.9.1�ȍ~�ł͍폜����܂����B
            }

            // ���Ƀ��^�f�B���N�g���Ƃ��Ďw�肳��Ă���f�B���N�g���𑖍�
            final File[] fileMeta3 = fileMetadir.listFiles();
            for (int index = 0; index < fileMeta3.length; index++) {
                if (fileMeta3[index].getName().endsWith(".xml") == false) {
                    continue;
                }

                final BlancoValueObjectXml2JavaClass xml2JavaClass = new BlancoValueObjectXml2JavaClass();
                xml2JavaClass.setEncoding(input.getEncoding());
                xml2JavaClass.setXmlRootElement(input.getXmlrootelement());
                xml2JavaClass.process(fileMeta3[index], new File(input
                        .getTargetdir()));

                // �P�̎����R�[�h�̎��������@�\�� 0.9.1�ȍ~�ł͍폜����܂����B
            }

            return BlancoValueObjectBatchProcess.END_SUCCESS;
        } catch (TransformerException e) {
            throw new IOException("XML�ϊ��̉ߒ��ŗ�O���������܂���: " + e.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
