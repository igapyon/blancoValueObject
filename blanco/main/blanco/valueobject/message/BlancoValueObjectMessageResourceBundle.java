/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.valueobject.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * ���b�Z�[�W��`[BlancoValueObject]�������I�ɗ��p���郊�\�[�X�o���h���N���X�B
 *
 * ���\�[�X�o���h����`: [BlancoValueObjectMessage]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 */
class BlancoValueObjectMessageResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoValueObjectMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObjectMessage]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoValueObjectMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/message/BlancoValueObjectMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoValueObjectMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObjectMessage]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoValueObjectMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/message/BlancoValueObjectMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoValueObjectMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoValueObjectMessage]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoValueObjectMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/valueobject/message/BlancoValueObjectMessage", locale, loader);
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
     * bundle[BlancoValueObjectMessage], key[MBVOJI01]
     *
     * [�N���X��[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJI01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoji01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJI01");
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
     * bundle[BlancoValueObjectMessage], key[MBVOJI02]
     *
     * [�N���X��[{0}]�̃t�B�[���h[{1}]�̌^�����w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJI02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoji02(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��[{0}]�̃t�B�[���h[{1}]�̌^�����w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJI02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObjectMessage], key[MBVOJI03]
     *
     * [�N���X��[{0}] �Ńt�B�[���h�����w�肳��Ă��Ȃ����̂�����܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJI03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoji03(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��[{0}] �Ńt�B�[���h�����w�肳��Ă��Ȃ����̂�����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJI03");
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
     * bundle[BlancoValueObjectMessage], key[MBVOJI04]
     *
     * [�N���X��[{0}] �t�B�[���h[{1}]�́u�^�v���w�肳��Ă��܂���B�u�^�v���w�肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJI04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoji04(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��[{0}] �t�B�[���h[{1}]�́u�^�v���w�肳��Ă��܂���B�u�^�v���w�肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJI04");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObjectMessage], key[MBVOJI05]
     *
     * [�N���X��[{0}] �t�B�[���h[{1}]�́u�f�t�H���g�l({2})�v���Z�b�g����Ă��܂��B�������u{3}�v�̓f�t�H���g�l���T�|�[�g���܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJI05]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoji05(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��[{0}] �t�B�[���h[{1}]�́u�f�t�H���g�l({2})�v���Z�b�g����Ă��܂��B�������u{3}�v�̓f�t�H���g�l���T�|�[�g���܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJI05");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoValueObjectMessage], key[MBVOJA01]
     *
     * [���^�f�B���N�g��[{0}]�����݂��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBVOJA01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbvoja01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���^�f�B���N�g��[{0}]�����݂��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBVOJA01");
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
