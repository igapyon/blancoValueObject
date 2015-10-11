/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.sample.valueobject;

import java.math.BigDecimal;
import java.util.List;

/**
 * BlancoValueObject�̂Ȃ��ŗ��p�����T���v����ValueObject�ł��B�p���Ǝ����̃T���v���ł��B�܂��A�t�B�[���h���̕ό`�͍s���܂���B���̃t�@�C����blancoValueObject�v���O�������̂��̂̏����ɂ͗��p����܂���I�P�Ȃ�T���v���ł��B
 */
public class BlancoValueObjectSampleStructure extends Thread implements Runnable {
    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [stringField1]�B
     * �f�t�H���g: [123]�B
     */
    private String fstringField1 = "123";

    /**
     * �t�B�[���h: [stringField2]�B
     */
    private String fstringField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [booleanField1]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fbooleanField1 = false;

    /**
     * �t�B�[���h: [booleanField2]�B
     */
    private boolean fbooleanField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [booleanObjField1]�B
     * �f�t�H���g: [true]�B
     */
    private Boolean fbooleanObjField1 = new Boolean(true);

    /**
     * �t�B�[���h: [booleanObjField2]�B
     */
    private Boolean fbooleanObjField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [shortField1]�B
     * �f�t�H���g: [123]�B
     */
    private short fshortField1 = 123;

    /**
     * �t�B�[���h: [shortField2]�B
     */
    private short fshortField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [shortObjField1]�B
     * �f�t�H���g: [3456]�B
     */
    private Short fshortObjField1 = new Short((short) 3456);

    /**
     * �t�B�[���h: [shortObjField2]�B
     */
    private Short fshortObjField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [intField1]�B
     * �f�t�H���g: [44444]�B
     */
    private int fintField1 = 44444;

    /**
     * �t�B�[���h: [intField2]�B
     */
    private int fintField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [intObjField1]�B
     * �f�t�H���g: [1012]�B
     */
    private Integer fintObjField1 = new Integer(1012);

    /**
     * �t�B�[���h: [intObjField2]�B
     */
    private Integer fintObjField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [longField1]�B
     * �f�t�H���g: [1234L]�B
     */
    private long flongField1 = 1234L;

    /**
     * �t�B�[���h: [longField2]�B
     */
    private long flongField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [longObjField1]�B
     * �f�t�H���g: [5678L]�B
     */
    private Long flongObjField1 = new Long(5678L);

    /**
     * �t�B�[���h: [longObjField2]�B
     */
    private Long flongObjField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [bigdecimalField1]�B
     * �f�t�H���g: [123.456]�B
     */
    private BigDecimal fbigdecimalField1 = new BigDecimal("123.456");

    /**
     * null�̎���
     *
     * �t�B�[���h: [bigdecimalField2]�B
     */
    private BigDecimal fbigdecimalField2;

    /**
     * �f�t�H���g�l����
     *
     * �t�B�[���h: [arraylistField1]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> farraylistField1 = new java.util.ArrayList<java.lang.String>();

    /**
     * �t�B�[���h: [arraylistField2]�B
     */
    private List<java.lang.String> farraylistField2;

    /**
     * ������z��̗�
     *
     * �t�B�[���h: [stringArray1]�B
     */
    private String[] fstringArray1;

    /**
     * �t�B�[���h [stringField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argstringField1 �t�B�[���h[stringField1]�ɐݒ肷��l�B
     */
    public void setstringField1(final String argstringField1) {
        fstringField1 = argstringField1;
    }

    /**
     * �t�B�[���h [stringField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [123]�B
     *
     * @return �t�B�[���h[stringField1]����擾�����l�B
     */
    public String getstringField1() {
        return fstringField1;
    }

    /**
     * �t�B�[���h [stringField2] �̒l��ݒ肵�܂��B
     *
     * @param argstringField2 �t�B�[���h[stringField2]�ɐݒ肷��l�B
     */
    public void setstringField2(final String argstringField2) {
        fstringField2 = argstringField2;
    }

    /**
     * �t�B�[���h [stringField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[stringField2]����擾�����l�B
     */
    public String getstringField2() {
        return fstringField2;
    }

    /**
     * �t�B�[���h [booleanField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argbooleanField1 �t�B�[���h[booleanField1]�ɐݒ肷��l�B
     */
    public void setbooleanField1(final boolean argbooleanField1) {
        fbooleanField1 = argbooleanField1;
    }

    /**
     * �t�B�[���h [booleanField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[booleanField1]����擾�����l�B
     */
    public boolean getbooleanField1() {
        return fbooleanField1;
    }

    /**
     * �t�B�[���h [booleanField2] �̒l��ݒ肵�܂��B
     *
     * @param argbooleanField2 �t�B�[���h[booleanField2]�ɐݒ肷��l�B
     */
    public void setbooleanField2(final boolean argbooleanField2) {
        fbooleanField2 = argbooleanField2;
    }

    /**
     * �t�B�[���h [booleanField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[booleanField2]����擾�����l�B
     */
    public boolean getbooleanField2() {
        return fbooleanField2;
    }

    /**
     * �t�B�[���h [booleanObjField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argbooleanObjField1 �t�B�[���h[booleanObjField1]�ɐݒ肷��l�B
     */
    public void setbooleanObjField1(final Boolean argbooleanObjField1) {
        fbooleanObjField1 = argbooleanObjField1;
    }

    /**
     * �t�B�[���h [booleanObjField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[booleanObjField1]����擾�����l�B
     */
    public Boolean getbooleanObjField1() {
        return fbooleanObjField1;
    }

    /**
     * �t�B�[���h [booleanObjField2] �̒l��ݒ肵�܂��B
     *
     * @param argbooleanObjField2 �t�B�[���h[booleanObjField2]�ɐݒ肷��l�B
     */
    public void setbooleanObjField2(final Boolean argbooleanObjField2) {
        fbooleanObjField2 = argbooleanObjField2;
    }

    /**
     * �t�B�[���h [booleanObjField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[booleanObjField2]����擾�����l�B
     */
    public Boolean getbooleanObjField2() {
        return fbooleanObjField2;
    }

    /**
     * �t�B�[���h [shortField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argshortField1 �t�B�[���h[shortField1]�ɐݒ肷��l�B
     */
    public void setshortField1(final short argshortField1) {
        fshortField1 = argshortField1;
    }

    /**
     * �t�B�[���h [shortField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [123]�B
     *
     * @return �t�B�[���h[shortField1]����擾�����l�B
     */
    public short getshortField1() {
        return fshortField1;
    }

    /**
     * �t�B�[���h [shortField2] �̒l��ݒ肵�܂��B
     *
     * @param argshortField2 �t�B�[���h[shortField2]�ɐݒ肷��l�B
     */
    public void setshortField2(final short argshortField2) {
        fshortField2 = argshortField2;
    }

    /**
     * �t�B�[���h [shortField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[shortField2]����擾�����l�B
     */
    public short getshortField2() {
        return fshortField2;
    }

    /**
     * �t�B�[���h [shortObjField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argshortObjField1 �t�B�[���h[shortObjField1]�ɐݒ肷��l�B
     */
    public void setshortObjField1(final Short argshortObjField1) {
        fshortObjField1 = argshortObjField1;
    }

    /**
     * �t�B�[���h [shortObjField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [3456]�B
     *
     * @return �t�B�[���h[shortObjField1]����擾�����l�B
     */
    public Short getshortObjField1() {
        return fshortObjField1;
    }

    /**
     * �t�B�[���h [shortObjField2] �̒l��ݒ肵�܂��B
     *
     * @param argshortObjField2 �t�B�[���h[shortObjField2]�ɐݒ肷��l�B
     */
    public void setshortObjField2(final Short argshortObjField2) {
        fshortObjField2 = argshortObjField2;
    }

    /**
     * �t�B�[���h [shortObjField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[shortObjField2]����擾�����l�B
     */
    public Short getshortObjField2() {
        return fshortObjField2;
    }

    /**
     * �t�B�[���h [intField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argintField1 �t�B�[���h[intField1]�ɐݒ肷��l�B
     */
    public void setintField1(final int argintField1) {
        fintField1 = argintField1;
    }

    /**
     * �t�B�[���h [intField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [44444]�B
     *
     * @return �t�B�[���h[intField1]����擾�����l�B
     */
    public int getintField1() {
        return fintField1;
    }

    /**
     * �t�B�[���h [intField2] �̒l��ݒ肵�܂��B
     *
     * @param argintField2 �t�B�[���h[intField2]�ɐݒ肷��l�B
     */
    public void setintField2(final int argintField2) {
        fintField2 = argintField2;
    }

    /**
     * �t�B�[���h [intField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[intField2]����擾�����l�B
     */
    public int getintField2() {
        return fintField2;
    }

    /**
     * �t�B�[���h [intObjField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argintObjField1 �t�B�[���h[intObjField1]�ɐݒ肷��l�B
     */
    public void setintObjField1(final Integer argintObjField1) {
        fintObjField1 = argintObjField1;
    }

    /**
     * �t�B�[���h [intObjField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [1012]�B
     *
     * @return �t�B�[���h[intObjField1]����擾�����l�B
     */
    public Integer getintObjField1() {
        return fintObjField1;
    }

    /**
     * �t�B�[���h [intObjField2] �̒l��ݒ肵�܂��B
     *
     * @param argintObjField2 �t�B�[���h[intObjField2]�ɐݒ肷��l�B
     */
    public void setintObjField2(final Integer argintObjField2) {
        fintObjField2 = argintObjField2;
    }

    /**
     * �t�B�[���h [intObjField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[intObjField2]����擾�����l�B
     */
    public Integer getintObjField2() {
        return fintObjField2;
    }

    /**
     * �t�B�[���h [longField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param arglongField1 �t�B�[���h[longField1]�ɐݒ肷��l�B
     */
    public void setlongField1(final long arglongField1) {
        flongField1 = arglongField1;
    }

    /**
     * �t�B�[���h [longField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [1234L]�B
     *
     * @return �t�B�[���h[longField1]����擾�����l�B
     */
    public long getlongField1() {
        return flongField1;
    }

    /**
     * �t�B�[���h [longField2] �̒l��ݒ肵�܂��B
     *
     * @param arglongField2 �t�B�[���h[longField2]�ɐݒ肷��l�B
     */
    public void setlongField2(final long arglongField2) {
        flongField2 = arglongField2;
    }

    /**
     * �t�B�[���h [longField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[longField2]����擾�����l�B
     */
    public long getlongField2() {
        return flongField2;
    }

    /**
     * �t�B�[���h [longObjField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param arglongObjField1 �t�B�[���h[longObjField1]�ɐݒ肷��l�B
     */
    public void setlongObjField1(final Long arglongObjField1) {
        flongObjField1 = arglongObjField1;
    }

    /**
     * �t�B�[���h [longObjField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [5678L]�B
     *
     * @return �t�B�[���h[longObjField1]����擾�����l�B
     */
    public Long getlongObjField1() {
        return flongObjField1;
    }

    /**
     * �t�B�[���h [longObjField2] �̒l��ݒ肵�܂��B
     *
     * @param arglongObjField2 �t�B�[���h[longObjField2]�ɐݒ肷��l�B
     */
    public void setlongObjField2(final Long arglongObjField2) {
        flongObjField2 = arglongObjField2;
    }

    /**
     * �t�B�[���h [longObjField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[longObjField2]����擾�����l�B
     */
    public Long getlongObjField2() {
        return flongObjField2;
    }

    /**
     * �t�B�[���h [bigdecimalField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argbigdecimalField1 �t�B�[���h[bigdecimalField1]�ɐݒ肷��l�B
     */
    public void setbigdecimalField1(final BigDecimal argbigdecimalField1) {
        fbigdecimalField1 = argbigdecimalField1;
    }

    /**
     * �t�B�[���h [bigdecimalField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [123.456]�B
     *
     * @return �t�B�[���h[bigdecimalField1]����擾�����l�B
     */
    public BigDecimal getbigdecimalField1() {
        return fbigdecimalField1;
    }

    /**
     * �t�B�[���h [bigdecimalField2] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [null�̎���]�B
     *
     * @param argbigdecimalField2 �t�B�[���h[bigdecimalField2]�ɐݒ肷��l�B
     */
    public void setbigdecimalField2(final BigDecimal argbigdecimalField2) {
        fbigdecimalField2 = argbigdecimalField2;
    }

    /**
     * �t�B�[���h [bigdecimalField2] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [null�̎���]�B
     *
     * @return �t�B�[���h[bigdecimalField2]����擾�����l�B
     */
    public BigDecimal getbigdecimalField2() {
        return fbigdecimalField2;
    }

    /**
     * �t�B�[���h [arraylistField1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     *
     * @param argarraylistField1 �t�B�[���h[arraylistField1]�ɐݒ肷��l�B
     */
    public void setarraylistField1(final List<java.lang.String> argarraylistField1) {
        farraylistField1 = argarraylistField1;
    }

    /**
     * �t�B�[���h [arraylistField1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l����]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[arraylistField1]����擾�����l�B
     */
    public List<java.lang.String> getarraylistField1() {
        return farraylistField1;
    }

    /**
     * �t�B�[���h [arraylistField2] �̒l��ݒ肵�܂��B
     *
     * @param argarraylistField2 �t�B�[���h[arraylistField2]�ɐݒ肷��l�B
     */
    public void setarraylistField2(final List<java.lang.String> argarraylistField2) {
        farraylistField2 = argarraylistField2;
    }

    /**
     * �t�B�[���h [arraylistField2] �̒l���擾���܂��B
     *
     * @return �t�B�[���h[arraylistField2]����擾�����l�B
     */
    public List<java.lang.String> getarraylistField2() {
        return farraylistField2;
    }

    /**
     * �t�B�[���h [stringArray1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [������z��̗�]�B
     *
     * @param argstringArray1 �t�B�[���h[stringArray1]�ɐݒ肷��l�B
     */
    public void setstringArray1(final String[] argstringArray1) {
        fstringArray1 = argstringArray1;
    }

    /**
     * �t�B�[���h [stringArray1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [������z��̗�]�B
     *
     * @return �t�B�[���h[stringArray1]����擾�����l�B
     */
    public String[] getstringArray1() {
        return fstringArray1;
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
        buf.append("blanco.sample.valueobject.BlancoValueObjectSampleStructure[");
        buf.append("stringField1=" + fstringField1);
        buf.append(",stringField2=" + fstringField2);
        buf.append(",booleanField1=" + fbooleanField1);
        buf.append(",booleanField2=" + fbooleanField2);
        buf.append(",booleanObjField1=" + fbooleanObjField1);
        buf.append(",booleanObjField2=" + fbooleanObjField2);
        buf.append(",shortField1=" + fshortField1);
        buf.append(",shortField2=" + fshortField2);
        buf.append(",shortObjField1=" + fshortObjField1);
        buf.append(",shortObjField2=" + fshortObjField2);
        buf.append(",intField1=" + fintField1);
        buf.append(",intField2=" + fintField2);
        buf.append(",intObjField1=" + fintObjField1);
        buf.append(",intObjField2=" + fintObjField2);
        buf.append(",longField1=" + flongField1);
        buf.append(",longField2=" + flongField2);
        buf.append(",longObjField1=" + flongObjField1);
        buf.append(",longObjField2=" + flongObjField2);
        buf.append(",bigdecimalField1=" + fbigdecimalField1);
        buf.append(",bigdecimalField2=" + fbigdecimalField2);
        buf.append(",arraylistField1=" + farraylistField1);
        buf.append(",arraylistField2=" + farraylistField2);
        if (fstringArray1 == null) {
            buf.append(",stringArray1=null");
        } else {
            buf.append(",stringArray1=[");
            for (int index = 0; index < fstringArray1.length; index++) {
                buf.append((index == 0 ? "" : ", ") + fstringArray1[index]);
            }
            buf.append("]");
        }
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
    public void copyTo(final BlancoValueObjectSampleStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoValueObjectSampleStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fstringField1
        // Type: java.lang.String
        target.fstringField1 = this.fstringField1;
        // Name: fstringField2
        // Type: java.lang.String
        target.fstringField2 = this.fstringField2;
        // Name: fbooleanField1
        // Type: boolean
        target.fbooleanField1 = this.fbooleanField1;
        // Name: fbooleanField2
        // Type: boolean
        target.fbooleanField2 = this.fbooleanField2;
        // Name: fbooleanObjField1
        // Type: java.lang.Boolean
        target.fbooleanObjField1 = this.fbooleanObjField1;
        // Name: fbooleanObjField2
        // Type: java.lang.Boolean
        target.fbooleanObjField2 = this.fbooleanObjField2;
        // Name: fshortField1
        // Type: short
        target.fshortField1 = this.fshortField1;
        // Name: fshortField2
        // Type: short
        target.fshortField2 = this.fshortField2;
        // Name: fshortObjField1
        // Type: java.lang.Short
        target.fshortObjField1 = this.fshortObjField1;
        // Name: fshortObjField2
        // Type: java.lang.Short
        target.fshortObjField2 = this.fshortObjField2;
        // Name: fintField1
        // Type: int
        target.fintField1 = this.fintField1;
        // Name: fintField2
        // Type: int
        target.fintField2 = this.fintField2;
        // Name: fintObjField1
        // Type: java.lang.Integer
        target.fintObjField1 = this.fintObjField1;
        // Name: fintObjField2
        // Type: java.lang.Integer
        target.fintObjField2 = this.fintObjField2;
        // Name: flongField1
        // Type: long
        target.flongField1 = this.flongField1;
        // Name: flongField2
        // Type: long
        target.flongField2 = this.flongField2;
        // Name: flongObjField1
        // Type: java.lang.Long
        target.flongObjField1 = this.flongObjField1;
        // Name: flongObjField2
        // Type: java.lang.Long
        target.flongObjField2 = this.flongObjField2;
        // Name: fbigdecimalField1
        // Type: java.math.BigDecimal
        target.fbigdecimalField1 = this.fbigdecimalField1;
        // Name: fbigdecimalField2
        // Type: java.math.BigDecimal
        target.fbigdecimalField2 = this.fbigdecimalField2;
        // Name: farraylistField1
        // Type: java.util.List
        // �t�B�[���h[farraylistField1]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
        // Name: farraylistField2
        // Type: java.util.List
        // �t�B�[���h[farraylistField2]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
        // Name: fstringArray1
        // Type: java.lang.String[]
        if (this.fstringArray1 != null) {
            target.fstringArray1 = new java.lang.String[this.fstringArray1.length];
            for (int index = 0; index < this.fstringArray1.length; index++) {
                // copy contents...
                target.fstringArray1[index] = this.fstringArray1[index];
            }
        }
    }
}
