package ch08.oop.class_;

public class ClassHouseClass01 {
    // 속성
    public String airconStat = "off";
    public String heatStat = "off";
    public String doorStat ="close";

    // 설계도
    // 기능
    public void airconOn() {
        // 기능 내부의 속성, 지역변수
        airconStat = "on";
    }

    public void airconOff() {
        airconStat = "off";
    }
} 
