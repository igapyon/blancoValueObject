/*
 * blanco Framework
 * Copyright (C) 2004-2010 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.valueobject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import blanco.beanutils.BlancoBeanUtils;
import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoNameUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.valueobject.message.BlancoValueObjectMessage;
import blanco.valueobject.resourcebundle.BlancoValueObjectResourceBundle;
import blanco.valueobject.valueobject.BlancoValueObjectClassStructure;
import blanco.valueobject.valueobject.BlancoValueObjectFieldStructure;

/**
 * �o�����[�I�u�W�F�N�g�p����XML�t�@�C������ Java�\�[�X�R�[�h��������������N���X�B
 * 
 * blancoValueObject�̎傽��N���X�̂ЂƂł��B
 * 
 * @author IGA Tosiki
 */
public class BlancoValueObjectXml2JavaClass {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoValueObjectMessage fMsg = new BlancoValueObjectMessage();

    /**
     * blancoValueObject�̃��\�[�X�o���h���I�u�W�F�N�g�B
     */
    private final BlancoValueObjectResourceBundle fBundle = new BlancoValueObjectResourceBundle();

    /**
     * �����I�ɗ��p����blancoCg�p�t�@�N�g���B
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * �����I�ɗ��p����blancoCg�p�\�[�X�t�@�C�����B
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * �����I�ɗ��p����blancoCg�p�N���X���B
     */
    private BlancoCgClass fCgClass = null;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    private boolean fIsXmlRootElement = false;

    public void setXmlRootElement(final boolean isXmlRootElement) {
        fIsXmlRootElement = isXmlRootElement;
    }

    /**
     * �o�����[�I�u�W�F�N�g��\�����钆��XML�t�@�C������AJava�\�[�X�R�[�h�������������܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ValueObject�Ɋւ��郁�^��񂪊܂܂�Ă���XML�t�@�C��
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h������f�B���N�g��
     * @throws IOException
     *             ���o�͗�O�����������ꍇ
     */
    public void process(final File argMetaXmlSourceFile,
            final File argDirectoryTarget) throws IOException {
        final BlancoValueObjectClassStructure[] structures = new BlancoValueObjectXmlParser()
                .parse(argMetaXmlSourceFile);
        for (int index = 0; index < structures.length; index++) {
            // ����ꂽ��񂩂�Java�\�[�X�R�[�h�𐶐����܂��B
            structure2Source(structures[index], argDirectoryTarget);
        }
    }

    /**
     * �^����ꂽ�N���X���o�����[�I�u�W�F�N�g����A�\�[�X�R�[�h�������������܂��B
     * 
     * @param argClassStructure
     *            �N���X���
     * @param argDirectoryTarget
     *            Java�\�[�X�R�[�h�̏o�͐�f�B���N�g��
     * @throws IOException
     *             ���o�͗�O�����������ꍇ�B
     */
    public void structure2Source(
            final BlancoValueObjectClassStructure argClassStructure,
            final File argDirectoryTarget) throws IOException {
        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(argDirectoryTarget
                .getAbsolutePath()
                + "/main");

        // BlancoCgObjectFactory�N���X�̃C���X�^���X���擾���܂��B
        fCgFactory = BlancoCgObjectFactory.getInstance();

        fCgSourceFile = fCgFactory.createSourceFile(argClassStructure
                .getPackage(), null);
        fCgSourceFile.setEncoding(fEncoding);

        // �N���X���쐬���܂��B
        fCgClass = fCgFactory.createClass(argClassStructure.getName(), "");
        fCgSourceFile.getClassList().add(fCgClass);

        // �N���X�̃A�N�Z�X��ݒ�B
        fCgClass.setAccess(argClassStructure.getAccess());
        // ���ۃN���X���ǂ����B
        fCgClass.setAbstract(argClassStructure.getAbstract());

        // �p��
        if (BlancoStringUtil.null2Blank(argClassStructure.getExtends())
                .length() > 0) {
            fCgClass.getExtendClassList().add(
                    fCgFactory.createType(argClassStructure.getExtends()));
        }
        // ����
        for (int index = 0; index < argClassStructure.getImplementsList()
                .size(); index++) {
            final String impl = (String) argClassStructure.getImplementsList()
                    .get(index);
            fCgClass.getImplementInterfaceList().add(
                    fCgFactory.createType(impl));
        }

        if (fIsXmlRootElement) {
            fCgClass.getAnnotationList().add("XmlRootElement");
            fCgSourceFile.getImportList().add(
                    "javax.xml.bind.annotation.XmlRootElement");
        }

        // �N���X��JavaDoc��ݒ肵�܂��B
        fCgClass.setDescription(argClassStructure.getDescription());
        for (String line : argClassStructure.getDescriptionList()) {
            fCgClass.getLangDoc().getDescriptionList().add(line);
        }

        for (int indexField = 0; indexField < argClassStructure.getFieldList()
                .size(); indexField++) {
            // ���̂��̂̃t�B�[���h���������܂��B
            final BlancoValueObjectFieldStructure fieldStructure = (BlancoValueObjectFieldStructure) argClassStructure
                    .getFieldList().get(indexField);

            // �K�{���ڂ����ݒ�̏ꍇ�ɂ͗�O���������{���܂��B
            if (fieldStructure.getName() == null) {
                throw new IllegalArgumentException(fMsg
                        .getMbvoji03(argClassStructure.getName()));
            }
            if (fieldStructure.getType() == null) {
                throw new IllegalArgumentException(fMsg.getMbvoji04(
                        argClassStructure.getName(), fieldStructure.getName()));
            }

            // �t�B�[���h�̐����B
            buildField(argClassStructure, fieldStructure);

            // �Z�b�^�[���\�b�h�̐����B
            buildMethodSet(argClassStructure, fieldStructure);

            // �Q�b�^�[���\�b�h�̐����B
            buildMethodGet(argClassStructure, fieldStructure);
        }

        if (argClassStructure.getGenerateToString()) {
            // toString���\�b�h�̐����B
            buildMethodToString(argClassStructure);
        }

        // TODO copyTo ���\�b�h�̐����L�����O���t���O�����邩�ǂ����������邱�ƁB
        BlancoBeanUtils.generateCopyToMethod(fCgSourceFile, fCgClass);

        // ���W���ꂽ�������Ɏ��ۂ̃\�[�X�R�[�h�����������B
        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }

    /**
     * �N���X�Ƀt�B�[���h�𐶐����܂��B
     * 
     * @param argClassStructure
     *            �N���X���B
     * @param argFieldStructure
     *            �t�B�[���h���B
     */
    private void buildField(
            final BlancoValueObjectClassStructure argClassStructure,
            final BlancoValueObjectFieldStructure argFieldStructure) {
        final BlancoCgField field = fCgFactory.createField("f"
                + getFieldNameAdjustered(argClassStructure, argFieldStructure),
                argFieldStructure.getType(), null);
        fCgClass.getFieldList().add(field);

        // �t�B�[���h��JavaDoc��ݒ肵�܂��B
        field.setDescription(argFieldStructure.getDescription());
        for (String line : argFieldStructure.getDescriptionList()) {
            field.getLangDoc().getDescriptionList().add(line);
        }
        field.getLangDoc().getDescriptionList().add(
                fBundle.getXml2javaclassFieldName(argFieldStructure.getName()));

        if (argFieldStructure.getDefault() != null) {
            // �t�B�[���h�̃f�t�H���g�l��ݒ肵�܂��B
            field.getLangDoc().getDescriptionList().add(
                    fBundle.getXml2javaclassFieldDefault(argFieldStructure
                            .getDefault()));
            if (argClassStructure.getAdjustDefaultValue() == false) {
                // �f�t�H���g�l�̕ό`��off�̏ꍇ�ɂ́A��`����̒l�����̂܂܍̗p�B
                field.setDefault(argFieldStructure.getDefault());
            } else {
                final String type = field.getType().getName();

                if (type.equals("java.lang.String")) {
                    // �_�u���N�I�[�g��t�^���܂��B
                    field.setDefault("\""
                            + BlancoJavaSourceUtil
                                    .escapeStringAsJavaSource(argFieldStructure
                                            .getDefault()) + "\"");
                } else if (type.equals("boolean") || type.equals("short")
                        || type.equals("int") || type.equals("long")) {
                    field.setDefault(argFieldStructure.getDefault());
                } else if (type.equals("java.lang.Boolean")
                        || type.equals("java.lang.Integer")
                        || type.equals("java.lang.Long")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(type) + "("
                            + argFieldStructure.getDefault() + ")");
                } else if (type.equals("java.lang.Short")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(type)
                            + "((short) " + argFieldStructure.getDefault()
                            + ")");
                } else if (type.equals("java.math.BigDecimal")) {
                    fCgSourceFile.getImportList().add("java.math.BigDecimal");
                    // �����񂩂�BigDecimal�ւƕϊ����܂��B
                    field.setDefault("new BigDecimal(\""
                            + argFieldStructure.getDefault() + "\")");
                } else if (type.equals("java.util.List")
                        || type.equals("java.util.ArrayList")) {
                    // ArrayList�̏ꍇ�ɂ́A�^����ꂽ���������̂܂܍̗p���܂��B
                    // TODO ��2����blancoValueObject�̗p�ꍇ�ɂ́A�S�N���X�C���|�[�g���Ó��B
                    fCgSourceFile.getImportList().add(type);
                    field.setDefault(argFieldStructure.getDefault());
                } else {
                    throw new IllegalArgumentException(fMsg.getMbvoji05(
                            argClassStructure.getName(), argFieldStructure
                                    .getName(), argFieldStructure.getDefault(),
                            type));
                }
            }
        }
    }

    /**
     * set���\�b�h�𐶐����܂��B
     * 
     * @param argFieldStructure
     *            �t�B�[���h���B
     */
    private void buildMethodSet(
            final BlancoValueObjectClassStructure argClassStructure,
            final BlancoValueObjectFieldStructure argFieldStructure) {
        // ���̂��̂̃t�B�[���h�ɑ΂���Z�b�^�[���\�b�h�𐶐����܂��B
        final BlancoCgMethod method = fCgFactory.createMethod("set"
                + getFieldNameAdjustered(argClassStructure, argFieldStructure),
                fBundle.getXml2javaclassSetJavadoc01(argFieldStructure
                        .getName()));
        fCgClass.getMethodList().add(method);

        // ���\�b�h�� JavaDoc�ݒ�B
        if (argFieldStructure.getDescription() != null) {
            method.getLangDoc().getDescriptionList().add(
                    fBundle.getXml2javaclassSetJavadoc02(argFieldStructure
                            .getDescription()));
        }
        for (String line : argFieldStructure.getDescriptionList()) {
            method.getLangDoc().getDescriptionList().add(line);
        }

        method.getParameterList().add(
                fCgFactory.createParameter("arg"
                        + getFieldNameAdjustered(argClassStructure,
                                argFieldStructure),
                        argFieldStructure.getType(),
                        fBundle.getXml2javaclassSetArgJavadoc(argFieldStructure
                                .getName())));

        // ���\�b�h�̎���
        method.getLineList().add(
                "f"
                        + getFieldNameAdjustered(argClassStructure,
                                argFieldStructure)
                        + " = "
                        + "arg"
                        + getFieldNameAdjustered(argClassStructure,
                                argFieldStructure) + ";");
    }

    /**
     * get���\�b�h�𐶐����܂��B
     * 
     * @param argFieldStructure
     *            �t�B�[���h���B
     */
    private void buildMethodGet(
            final BlancoValueObjectClassStructure argClassStructure,
            final BlancoValueObjectFieldStructure argFieldStructure) {
        // ���̂��̂̃t�B�[���h�ɑ΂���Q�b�^�[���\�b�h�𐶐����܂��B
        final BlancoCgMethod method = fCgFactory.createMethod("get"
                + getFieldNameAdjustered(argClassStructure, argFieldStructure),
                fBundle.getXml2javaclassGetJavadoc01(argFieldStructure
                        .getName()));
        fCgClass.getMethodList().add(method);

        // ���\�b�h�� JavaDoc�ݒ�B
        if (argFieldStructure.getDescription() != null) {
            method.getLangDoc().getDescriptionList().add(
                    fBundle.getXml2javaclassGetJavadoc02(argFieldStructure
                            .getDescription()));
        }
        for (String line : argFieldStructure.getDescriptionList()) {
            method.getLangDoc().getDescriptionList().add(line);
        }
        if (argFieldStructure.getDefault() != null) {
            method.getLangDoc().getDescriptionList().add(
                    fBundle.getXml2javaclassGetDefaultJavadoc(argFieldStructure
                            .getDefault()));
        }

        method.setReturn(fCgFactory.createReturn(argFieldStructure.getType(),
                fBundle.getXml2javaclassGetReturnJavadoc(argFieldStructure
                        .getName())));

        // ���\�b�h�̎���
        method.getLineList().add(
                "return f"
                        + getFieldNameAdjustered(argClassStructure,
                                argFieldStructure) + ";");
    }

    /**
     * toString���\�b�h�𐶐����܂��B
     * 
     * @param argClassStructure
     *            �N���X���B
     */
    private void buildMethodToString(
            final BlancoValueObjectClassStructure argClassStructure) {
        final BlancoCgMethod method = fCgFactory.createMethod("toString",
                "���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B");
        fCgClass.getMethodList().add(method);

        method.getLangDoc().getDescriptionList().add("<P>�g�p��̒���</P>");
        method.getLangDoc().getDescriptionList().add("<UL>");
        method.getLangDoc().getDescriptionList().add(
                "<LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B");
        method.getLangDoc().getDescriptionList().add(
                "<LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B");
        method.getLangDoc().getDescriptionList().add("</UL>");
        method.setReturn(fCgFactory.createReturn("java.lang.String",
                "�o�����[�I�u�W�F�N�g�̕�����\���B"));
        method.getAnnotationList().add("Override");

        final List<java.lang.String> listLine = method.getLineList();

        listLine.add("final StringBuffer buf = new StringBuffer();");
        listLine.add("buf.append(\"" + argClassStructure.getPackage() + "."
                + argClassStructure.getName() + "[\");");
        for (int indexField = 0; indexField < argClassStructure.getFieldList()
                .size(); indexField++) {
            final BlancoValueObjectFieldStructure field = (BlancoValueObjectFieldStructure) argClassStructure
                    .getFieldList().get(indexField);

            final String fieldNameAdjustered = (argClassStructure
                    .getAdjustFieldName() == false ? field.getName()
                    : BlancoNameAdjuster.toClassName(field.getName()));

            if (field.getType().endsWith("[]") == false) {
                listLine.add("buf.append(\"" + (indexField == 0 ? "" : ",")
                        + field.getName() + "=\" + f" + fieldNameAdjustered
                        + ");");
            } else {
                // 2006.05.31 t.iga �z��̏ꍇ�ɂ́A���
                // ���̔z�񎩐g��null���ǂ����̃`�F�b�N���K�v�ł��B
                listLine.add("if (f" + fieldNameAdjustered + " == null) {");
                // 0�Ԗڂ̍��ڂł���ꍇ�ɂ̓J���}�Ȃ��̓��ʈ��������܂��B
                listLine.add("buf.append(" + (indexField == 0 ? "\"" :
                // 0�Ԗڂł͂Ȃ��ꍇ�ɂ́A��ɃJ���}��t�^���܂��B
                        "\",") + field.getName() + "=null\");");
                listLine.add("} else {");

                // �z��̏ꍇ�ɂ̓f�B�[�v��toString���܂��B
                listLine.add("buf.append("
                // 0�Ԗڂ̍��ڂł���ꍇ�ɂ̓J���}�Ȃ��̓��ʈ��������܂��B
                        + (indexField == 0 ? "\"" :
                        // 0�Ԗڂł͂Ȃ��ꍇ�ɂ́A��ɃJ���}��t�^���܂��B
                                "\",") + field.getName() + "=[\");");
                listLine.add("for (int index = 0; index < f"
                        + fieldNameAdjustered + ".length; index++) {");
                // 2006.05.31 t.iga
                // ArrayList�Ȃǂ�toString�Ɠ��l�ɂȂ�悤�ɁA�J���}�̂��Ƃɔ��p�X�y�[�X��t�^����悤�ɂ��܂��B
                listLine.add("buf.append((index == 0 ? \"\" : \", \") + f"
                        + fieldNameAdjustered + "[index]);");
                listLine.add("}");
                listLine.add("buf.append(\"]\");");
                listLine.add("}");
            }
        }
        listLine.add("buf.append(\"]\");");
        listLine.add("return buf.toString();");
    }

    /**
     * �����ς݂̃t�B�[���h�����擾���܂��B
     * 
     * @param argFieldStructure
     *            �t�B�[���h���B
     * @return ������̃t�B�[���h���B
     */
    private String getFieldNameAdjustered(
            final BlancoValueObjectClassStructure argClassStructure,
            final BlancoValueObjectFieldStructure argFieldStructure) {
        return (argClassStructure.getAdjustFieldName() == false ? argFieldStructure
                .getName()
                : BlancoNameAdjuster.toClassName(argFieldStructure.getName()));
    }
}
