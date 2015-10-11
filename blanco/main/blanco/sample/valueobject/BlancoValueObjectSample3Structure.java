/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.sample.valueobject;

/**
 * �N���X�����B���s�ȂǎQ�ƕ����̎����B�P�s�ځB(&lt;&gt;&quot;�������Q�ƃG���R�[�f�B���O�����)
 *
 * �Q�s�ځB(<>"�����̂܂܏o��)
 * �R�s�ځB(<>"�����̂܂܏o��)
 * �S�s�ځB(<>"�����̂܂܏o��)
 */
public class BlancoValueObjectSample3Structure {
    /**
     * �t�B�[���h�����B���s�ȂǎQ�ƕ����̎����B�P�s�ځB(&lt;&gt;&quot;�������Q�ƃG���R�[�f�B���O�����)
     *
     * �Q�s�ځB(<>"�����̂܂܏o��)
     * �R�s�ځB(<>"�����̂܂܏o��)
     * �S�s�ځB(<>"�����̂܂܏o��)
     * �t�B�[���h: [field1]�B
     * �f�t�H���g: ["������"]�B
     */
    private String fField1 = "\"������\"";

    /**
     * �t�B�[���h [field1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�����B���s�ȂǎQ�ƕ����̎����B�P�s�ځB(<>"�������Q�ƃG���R�[�f�B���O�����)]�B
     * �Q�s�ځB(<>"�����̂܂܏o��)
     * �R�s�ځB(<>"�����̂܂܏o��)
     * �S�s�ځB(<>"�����̂܂܏o��)
     *
     * @param argField1 �t�B�[���h[field1]�ɐݒ肷��l�B
     */
    public void setField1(final String argField1) {
        fField1 = argField1;
    }

    /**
     * �t�B�[���h [field1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�����B���s�ȂǎQ�ƕ����̎����B�P�s�ځB(<>"�������Q�ƃG���R�[�f�B���O�����)]�B
     * �Q�s�ځB(<>"�����̂܂܏o��)
     * �R�s�ځB(<>"�����̂܂܏o��)
     * �S�s�ځB(<>"�����̂܂܏o��)
     * �f�t�H���g: ["������"]�B
     *
     * @return �t�B�[���h[field1]����擾�����l�B
     */
    public String getField1() {
        return fField1;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.sample.valueobject.BlancoValueObjectSample3Structure[");
        buf.append("field1=" + fField1);
        buf.append("]");
        return buf.toString();
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g���w��̃^�[�Q�b�g�ɕ��ʂ��܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ��ʏ����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @param target target value object.
     */
    public void copyTo(final BlancoValueObjectSample3Structure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoValueObjectSample3Structure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fField1
        // Type: java.lang.String
        target.fField1 = this.fField1;
    }
}
