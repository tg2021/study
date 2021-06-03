package ch22.opp.enumpackage;

public enum EnumClass03 {
    
    MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토"), SUN("일");

    public String strName;

    private EnumClass03 (String strName) {
        this.strName = strName;
    }
}
