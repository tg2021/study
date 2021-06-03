package ch22.opp.enumpackage;

public enum EnumClass01 {
    
    CREATE(1, "저장"), READ(2, "읽기"), UPDATE(3, "수정"), DELETE(4, "삭제");

    private int intValue;
    private String strName;

    private EnumClass01(int intValue, String strName) {
        this.intValue = intValue;
        this.strName = strName;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStrName() {
        return strName;
    }

    
    
}
