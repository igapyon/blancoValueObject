/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.valueobject.valueobject;

import java.util.List;

/**
 * �o�����[�I�u�W�F�N�g�̃t�B�[���h������킷�o�����[�I�u�W�F�N�g�N���X�B���̃N���X�̐ݒ�������ƂɃt�B�[���h�ƃZ�b�^�[�E�Q�b�^�[��������������܂��B
 */
public class BlancoValueObjectFieldStructure {
    /**
     * ���ڔԍ��B�ȗ��\�ł��B
     *
     * �t�B�[���h: [no]�B
     */
    private String fNo;

    /**
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [type]�B
     */
    private String fType;

    /**
     * �f�t�H���g�l���w�肵�܂��B
     *
     * �t�B�[���h: [default]�B
     */
    private String fDefault;

    /**
     * �t�B�[���h�̐����ł��B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * �t�B�[���h�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B
     *
     * �t�B�[���h: [descriptionList]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> fDescriptionList = new java.util.ArrayList<java.lang.String>();

    /**
     * (JavaDoc�ւ̔��f�̂�)���K�\�����w�肵�܂��B
     *
     * �t�B�[���h: [pattern]�B
     */
    private String fPattern;

    /**
     * (JavaDoc�ւ̔��f�̂�)�ŏ��̒������w�肵�܂��B
     *
     * �t�B�[���h: [minLength]�B
     */
    private String fMinLength;

    /**
     * (JavaDoc�ւ̔��f�̂�)�ő�̒������w�肵�܂��B
     *
     * �t�B�[���h: [maxLength]�B
     */
    private String fMaxLength;

    /**
     * (JavaDoc�ւ̔��f�̂�)�������w�肵�܂��B
     *
     * �t�B�[���h: [length]�B
     */
    private String fLength;

    /**
     * (JavaDoc�ւ̔��f�̂�)�ŏ��l���w�肵�܂��B
     *
     * �t�B�[���h: [minInclusive]�B
     */
    private String fMinInclusive;

    /**
     * (JavaDoc�ւ̔��f�̂�)�ő�l���w�肵�܂��B
     *
     * �t�B�[���h: [maxInclusive]�B
     */
    private String fMaxInclusive;

    /**
     * �t�B�[���h [no] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ��B�ȗ��\�ł��B]�B
     *
     * @param argNo �t�B�[���h[no]�ɐݒ肷��l�B
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * �t�B�[���h [no] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ��B�ȗ��\�ł��B]�B
     *
     * @return �t�B�[���h[no]����擾�����l�B
     */
    public String getNo() {
        return fNo;
    }

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [type] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argType �t�B�[���h[type]�ɐݒ肷��l�B
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * �t�B�[���h [type] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[type]����擾�����l�B
     */
    public String getType() {
        return fType;
    }

    /**
     * �t�B�[���h [default] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l���w�肵�܂��B]�B
     *
     * @param argDefault �t�B�[���h[default]�ɐݒ肷��l�B
     */
    public void setDefault(final String argDefault) {
        fDefault = argDefault;
    }

    /**
     * �t�B�[���h [default] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[default]����擾�����l�B
     */
    public String getDefault() {
        return fDefault;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̐����ł��B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̐����ł��B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     *
     * @param argDescriptionList �t�B�[���h[descriptionList]�ɐݒ肷��l�B
     */
    public void setDescriptionList(final List<java.lang.String> argDescriptionList) {
        fDescriptionList = argDescriptionList;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[descriptionList]����擾�����l�B
     */
    public List<java.lang.String> getDescriptionList() {
        return fDescriptionList;
    }

    /**
     * �t�B�[���h [pattern] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)���K�\�����w�肵�܂��B]�B
     *
     * @param argPattern �t�B�[���h[pattern]�ɐݒ肷��l�B
     */
    public void setPattern(final String argPattern) {
        fPattern = argPattern;
    }

    /**
     * �t�B�[���h [pattern] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)���K�\�����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[pattern]����擾�����l�B
     */
    public String getPattern() {
        return fPattern;
    }

    /**
     * �t�B�[���h [minLength] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ŏ��̒������w�肵�܂��B]�B
     *
     * @param argMinLength �t�B�[���h[minLength]�ɐݒ肷��l�B
     */
    public void setMinLength(final String argMinLength) {
        fMinLength = argMinLength;
    }

    /**
     * �t�B�[���h [minLength] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ŏ��̒������w�肵�܂��B]�B
     *
     * @return �t�B�[���h[minLength]����擾�����l�B
     */
    public String getMinLength() {
        return fMinLength;
    }

    /**
     * �t�B�[���h [maxLength] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ő�̒������w�肵�܂��B]�B
     *
     * @param argMaxLength �t�B�[���h[maxLength]�ɐݒ肷��l�B
     */
    public void setMaxLength(final String argMaxLength) {
        fMaxLength = argMaxLength;
    }

    /**
     * �t�B�[���h [maxLength] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ő�̒������w�肵�܂��B]�B
     *
     * @return �t�B�[���h[maxLength]����擾�����l�B
     */
    public String getMaxLength() {
        return fMaxLength;
    }

    /**
     * �t�B�[���h [length] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�������w�肵�܂��B]�B
     *
     * @param argLength �t�B�[���h[length]�ɐݒ肷��l�B
     */
    public void setLength(final String argLength) {
        fLength = argLength;
    }

    /**
     * �t�B�[���h [length] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�������w�肵�܂��B]�B
     *
     * @return �t�B�[���h[length]����擾�����l�B
     */
    public String getLength() {
        return fLength;
    }

    /**
     * �t�B�[���h [minInclusive] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ŏ��l���w�肵�܂��B]�B
     *
     * @param argMinInclusive �t�B�[���h[minInclusive]�ɐݒ肷��l�B
     */
    public void setMinInclusive(final String argMinInclusive) {
        fMinInclusive = argMinInclusive;
    }

    /**
     * �t�B�[���h [minInclusive] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ŏ��l���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[minInclusive]����擾�����l�B
     */
    public String getMinInclusive() {
        return fMinInclusive;
    }

    /**
     * �t�B�[���h [maxInclusive] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ő�l���w�肵�܂��B]�B
     *
     * @param argMaxInclusive �t�B�[���h[maxInclusive]�ɐݒ肷��l�B
     */
    public void setMaxInclusive(final String argMaxInclusive) {
        fMaxInclusive = argMaxInclusive;
    }

    /**
     * �t�B�[���h [maxInclusive] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [(JavaDoc�ւ̔��f�̂�)�ő�l���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[maxInclusive]����擾�����l�B
     */
    public String getMaxInclusive() {
        return fMaxInclusive;
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
        buf.append("blanco.valueobject.valueobject.BlancoValueObjectFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",default=" + fDefault);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",pattern=" + fPattern);
        buf.append(",minLength=" + fMinLength);
        buf.append(",maxLength=" + fMaxLength);
        buf.append(",length=" + fLength);
        buf.append(",minInclusive=" + fMinInclusive);
        buf.append(",maxInclusive=" + fMaxInclusive);
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
    public void copyTo(final BlancoValueObjectFieldStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoValueObjectFieldStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fNo
        // Type: java.lang.String
        target.fNo = this.fNo;
        // Name: fName
        // Type: java.lang.String
        target.fName = this.fName;
        // Name: fType
        // Type: java.lang.String
        target.fType = this.fType;
        // Name: fDefault
        // Type: java.lang.String
        target.fDefault = this.fDefault;
        // Name: fDescription
        // Type: java.lang.String
        target.fDescription = this.fDescription;
        // Name: fDescriptionList
        // Type: java.util.List
        // �t�B�[���h[fDescriptionList]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
        // Name: fPattern
        // Type: java.lang.String
        target.fPattern = this.fPattern;
        // Name: fMinLength
        // Type: java.lang.String
        target.fMinLength = this.fMinLength;
        // Name: fMaxLength
        // Type: java.lang.String
        target.fMaxLength = this.fMaxLength;
        // Name: fLength
        // Type: java.lang.String
        target.fLength = this.fLength;
        // Name: fMinInclusive
        // Type: java.lang.String
        target.fMinInclusive = this.fMinInclusive;
        // Name: fMaxInclusive
        // Type: java.lang.String
        target.fMaxInclusive = this.fMaxInclusive;
    }
}
