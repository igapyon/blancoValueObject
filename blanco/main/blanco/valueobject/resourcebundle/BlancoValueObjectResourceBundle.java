/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.valueobject.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoValueObject�����p���郊�\�[�X�o���h����~���܂��B
 *
 * ���\�[�X�o���h����`: [BlancoValueObject]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoValueObjectResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoValueObjectResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObject]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoValueObjectResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/resourcebundle/BlancoValueObject");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoValueObjectResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObject]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoValueObjectResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/resourcebundle/BlancoValueObject", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoValueObjectResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObject]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoValueObjectResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/resourcebundle/BlancoValueObject", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoValueObject], key[METAFILE_DISPLAYNAME]
     *
     * [�o�����[�I�u�W�F�N�g��`��] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�o�����[�I�u�W�F�N�g��`��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.FIELD.NAME]
     *
     * [�t�B�[���h: [{0}]�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.FIELD.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassFieldName(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h: [{0}]�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.FIELD.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.FIELD.DEFAULT]
     *
     * [�f�t�H���g: [{0}]�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.FIELD.DEFAULT]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassFieldDefault(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f�t�H���g: [{0}]�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.FIELD.DEFAULT");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.SET.JAVADOC.01]
     *
     * [�t�B�[���h [{0}] �̒l��ݒ肵�܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.SET.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassSetJavadoc01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h [{0}] �̒l��ݒ肵�܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.SET.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.SET.JAVADOC.02]
     *
     * [�t�B�[���h�̐���: [{0}]�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.SET.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassSetJavadoc02(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h�̐���: [{0}]�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.SET.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.SET.ARG.JAVADOC]
     *
     * [�t�B�[���h[{0}]�ɐݒ肷��l�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.SET.ARG.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassSetArgJavadoc(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h[{0}]�ɐݒ肷��l�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.SET.ARG.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.GET.JAVADOC.01]
     *
     * [�t�B�[���h [{0}] �̒l���擾���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.GET.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassGetJavadoc01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h [{0}] �̒l���擾���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.GET.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.GET.JAVADOC.02]
     *
     * [�t�B�[���h�̐���: [{0}]�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.GET.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassGetJavadoc02(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h�̐���: [{0}]�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.GET.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.GET.DEFAULT.JAVADOC]
     *
     * [�f�t�H���g: [{0}]�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.GET.DEFAULT.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassGetDefaultJavadoc(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f�t�H���g: [{0}]�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.GET.DEFAULT.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObject], key[XML2JAVACLASS.GET.RETURN.JAVADOC]
     *
     * [�t�B�[���h[{0}]����擾�����l�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.GET.RETURN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassGetReturnJavadoc(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h[{0}]����擾�����l�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.GET.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
