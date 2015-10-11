/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.valueobject.message;

/**
 * blancoValueObject�����p���郁�b�Z�[�W�B
 */
public class BlancoValueObjectMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final BlancoValueObjectMessageResourceBundle fBundle = new BlancoValueObjectMessageResourceBundle();

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJI01]�̕�������擾���܂��B
     *
     * No.2:
     * ������[�N���X��[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoji01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJI01] " + fBundle.getMbvoji01(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJI02]�̕�������擾���܂��B
     *
     * No.3:
     * ������[�N���X��[{0}]�̃t�B�[���h[{1}]�̌^�����w�肳��Ă��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoji02(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji02]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJI02] " + fBundle.getMbvoji02(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJI03]�̕�������擾���܂��B
     *
     * No.4:
     * ������[�N���X��[{0}] �Ńt�B�[���h�����w�肳��Ă��Ȃ����̂�����܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoji03(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJI03] " + fBundle.getMbvoji03(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJI04]�̕�������擾���܂��B
     *
     * No.5:
     * ������[�N���X��[{0}] �t�B�[���h[{1}]�́u�^�v���w�肳��Ă��܂���B�u�^�v���w�肵�Ă��������B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoji04(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJI04] " + fBundle.getMbvoji04(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJI05]�̕�������擾���܂��B
     *
     * No.6:
     * ������[�N���X��[{0}] �t�B�[���h[{1}]�́u�f�t�H���g�l({2})�v���Z�b�g����Ă��܂��B�������u{3}�v�̓f�t�H���g�l���T�|�[�g���܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoji05(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji05]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji05]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji05]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoji05]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJI05] " + fBundle.getMbvoji05(arg0, arg1, arg2, arg3);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoValueObject]�A�L�[[MBVOJA01]�̕�������擾���܂��B
     *
     * No.9:
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbvoja01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbvoja01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBVOJA01] " + fBundle.getMbvoja01(arg0);
    }
}
