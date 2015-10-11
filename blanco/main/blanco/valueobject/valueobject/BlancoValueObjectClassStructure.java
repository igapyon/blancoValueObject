/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.valueobject.valueobject;

import java.util.List;

/**
 * �o�����[�I�u�W�F�N�g�̃N���X������킷�o�����[�I�u�W�F�N�g�N���X�B���̃N���X�̐ݒ�������ƂɃN���X��������������܂��B
 */
public class BlancoValueObjectClassStructure {
    /**
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [package]�B
     */
    private String fPackage;

    /**
     * �N���X�̐����ł��B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * �N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B
     *
     * �t�B�[���h: [descriptionList]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> fDescriptionList = new java.util.ArrayList<java.lang.String>();

    /**
     * �N���X�̃A�N�Z�X�B�ʏ�� public�B
     *
     * �t�B�[���h: [access]�B
     * �f�t�H���g: ["public"]�B
     */
    private String fAccess = "public";

    /**
     * ���ۃN���X���ǂ����B�ʏ�� false�B
     *
     * �t�B�[���h: [abstract]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fAbstract = false;

    /**
     * toString���\�b�h�𐶐����邩�ǂ����B
     *
     * �t�B�[���h: [generateToString]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fGenerateToString = true;

    /**
     * �t�B�[���h���̖��O�ό`�������Ȃ����ǂ����B
     *
     * �t�B�[���h: [adjustFieldName]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fAdjustFieldName = true;

    /**
     * �f�t�H���g�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B
     *
     * �t�B�[���h: [adjustDefaultValue]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fAdjustDefaultValue = true;

    /**
     * �p������N���X���w�肵�܂��B
     *
     * �t�B�[���h: [extends]�B
     */
    private String fExtends;

    /**
     * ��������C���^�t�F�[�X(java.lang.String)�̈ꗗ�B
     *
     * �t�B�[���h: [implementsList]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> fImplementsList = new java.util.ArrayList<java.lang.String>();

    /**
     * �t�B�[���h���L�����郊�X�g���w�肵�܂��B
     *
     * �t�B�[���h: [fieldList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure>()]�B
     */
    private List<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure> fFieldList = new java.util.ArrayList<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure>();

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
     * �t�B�[���h [package] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argPackage �t�B�[���h[package]�ɐݒ肷��l�B
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h [package] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[package]����擾�����l�B
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̐����ł��B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̐����ł��B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     *
     * @param argDescriptionList �t�B�[���h[descriptionList]�ɐݒ肷��l�B
     */
    public void setDescriptionList(final List<java.lang.String> argDescriptionList) {
        fDescriptionList = argDescriptionList;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[descriptionList]����擾�����l�B
     */
    public List<java.lang.String> getDescriptionList() {
        return fDescriptionList;
    }

    /**
     * �t�B�[���h [access] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̃A�N�Z�X�B�ʏ�� public�B]�B
     *
     * @param argAccess �t�B�[���h[access]�ɐݒ肷��l�B
     */
    public void setAccess(final String argAccess) {
        fAccess = argAccess;
    }

    /**
     * �t�B�[���h [access] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̃A�N�Z�X�B�ʏ�� public�B]�B
     * �f�t�H���g: ["public"]�B
     *
     * @return �t�B�[���h[access]����擾�����l�B
     */
    public String getAccess() {
        return fAccess;
    }

    /**
     * �t�B�[���h [abstract] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ۃN���X���ǂ����B�ʏ�� false�B]�B
     *
     * @param argAbstract �t�B�[���h[abstract]�ɐݒ肷��l�B
     */
    public void setAbstract(final boolean argAbstract) {
        fAbstract = argAbstract;
    }

    /**
     * �t�B�[���h [abstract] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ۃN���X���ǂ����B�ʏ�� false�B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[abstract]����擾�����l�B
     */
    public boolean getAbstract() {
        return fAbstract;
    }

    /**
     * �t�B�[���h [generateToString] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [toString���\�b�h�𐶐����邩�ǂ����B]�B
     *
     * @param argGenerateToString �t�B�[���h[generateToString]�ɐݒ肷��l�B
     */
    public void setGenerateToString(final boolean argGenerateToString) {
        fGenerateToString = argGenerateToString;
    }

    /**
     * �t�B�[���h [generateToString] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [toString���\�b�h�𐶐����邩�ǂ����B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[generateToString]����擾�����l�B
     */
    public boolean getGenerateToString() {
        return fGenerateToString;
    }

    /**
     * �t�B�[���h [adjustFieldName] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���̖��O�ό`�������Ȃ����ǂ����B]�B
     *
     * @param argAdjustFieldName �t�B�[���h[adjustFieldName]�ɐݒ肷��l�B
     */
    public void setAdjustFieldName(final boolean argAdjustFieldName) {
        fAdjustFieldName = argAdjustFieldName;
    }

    /**
     * �t�B�[���h [adjustFieldName] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���̖��O�ό`�������Ȃ����ǂ����B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[adjustFieldName]����擾�����l�B
     */
    public boolean getAdjustFieldName() {
        return fAdjustFieldName;
    }

    /**
     * �t�B�[���h [adjustDefaultValue] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B]�B
     *
     * @param argAdjustDefaultValue �t�B�[���h[adjustDefaultValue]�ɐݒ肷��l�B
     */
    public void setAdjustDefaultValue(final boolean argAdjustDefaultValue) {
        fAdjustDefaultValue = argAdjustDefaultValue;
    }

    /**
     * �t�B�[���h [adjustDefaultValue] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[adjustDefaultValue]����擾�����l�B
     */
    public boolean getAdjustDefaultValue() {
        return fAdjustDefaultValue;
    }

    /**
     * �t�B�[���h [extends] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p������N���X���w�肵�܂��B]�B
     *
     * @param argExtends �t�B�[���h[extends]�ɐݒ肷��l�B
     */
    public void setExtends(final String argExtends) {
        fExtends = argExtends;
    }

    /**
     * �t�B�[���h [extends] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p������N���X���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[extends]����擾�����l�B
     */
    public String getExtends() {
        return fExtends;
    }

    /**
     * �t�B�[���h [implementsList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [��������C���^�t�F�[�X(java.lang.String)�̈ꗗ�B]�B
     *
     * @param argImplementsList �t�B�[���h[implementsList]�ɐݒ肷��l�B
     */
    public void setImplementsList(final List<java.lang.String> argImplementsList) {
        fImplementsList = argImplementsList;
    }

    /**
     * �t�B�[���h [implementsList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [��������C���^�t�F�[�X(java.lang.String)�̈ꗗ�B]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[implementsList]����擾�����l�B
     */
    public List<java.lang.String> getImplementsList() {
        return fImplementsList;
    }

    /**
     * �t�B�[���h [fieldList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���L�����郊�X�g���w�肵�܂��B]�B
     *
     * @param argFieldList �t�B�[���h[fieldList]�ɐݒ肷��l�B
     */
    public void setFieldList(final List<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * �t�B�[���h [fieldList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���L�����郊�X�g���w�肵�܂��B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure>()]�B
     *
     * @return �t�B�[���h[fieldList]����擾�����l�B
     */
    public List<blanco.valueobject.valueobject.BlancoValueObjectFieldStructure> getFieldList() {
        return fFieldList;
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
        buf.append("blanco.valueobject.valueobject.BlancoValueObjectClassStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",access=" + fAccess);
        buf.append(",abstract=" + fAbstract);
        buf.append(",generateToString=" + fGenerateToString);
        buf.append(",adjustFieldName=" + fAdjustFieldName);
        buf.append(",adjustDefaultValue=" + fAdjustDefaultValue);
        buf.append(",extends=" + fExtends);
        buf.append(",implementsList=" + fImplementsList);
        buf.append(",fieldList=" + fFieldList);
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
    public void copyTo(final BlancoValueObjectClassStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoValueObjectClassStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fName
        // Type: java.lang.String
        target.fName = this.fName;
        // Name: fPackage
        // Type: java.lang.String
        target.fPackage = this.fPackage;
        // Name: fDescription
        // Type: java.lang.String
        target.fDescription = this.fDescription;
        // Name: fDescriptionList
        // Type: java.util.List
        // �t�B�[���h[fDescriptionList]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
        // Name: fAccess
        // Type: java.lang.String
        target.fAccess = this.fAccess;
        // Name: fAbstract
        // Type: boolean
        target.fAbstract = this.fAbstract;
        // Name: fGenerateToString
        // Type: boolean
        target.fGenerateToString = this.fGenerateToString;
        // Name: fAdjustFieldName
        // Type: boolean
        target.fAdjustFieldName = this.fAdjustFieldName;
        // Name: fAdjustDefaultValue
        // Type: boolean
        target.fAdjustDefaultValue = this.fAdjustDefaultValue;
        // Name: fExtends
        // Type: java.lang.String
        target.fExtends = this.fExtends;
        // Name: fImplementsList
        // Type: java.util.List
        // �t�B�[���h[fImplementsList]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
        // Name: fFieldList
        // Type: java.util.List
        // �t�B�[���h[fFieldList]�̓T�|�[�g�O�̌^[java.util.List]�ł��B
    }
}
