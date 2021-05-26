package ch08.oop.class_;

import java.util.ArrayList;
import java.util.List;

public class ClassEntityArrayTestClass02 {
    public static void main(String[] args) {
        // 객체배열 
        ClassHouseClass01[] houseArray = new ClassHouseClass01[3];
        houseArray[0] = new ClassHouseClass01();
        houseArray[1] = new ClassHouseClass01();
        houseArray[2] = new ClassHouseClass01();

        houseArray[0].airconOn();
        houseArray[1].airconOff();

        System.out.println("0번째 배열 : " + houseArray[0].airconStat);
        System.out.println("1번째 배열 : " + houseArray[1].airconStat);

        ClassHouseClass01[] house = new ClassHouseClass01[] {new ClassHouseClass01(),
            new ClassHouseClass01(), new ClassHouseClass01()};

        house[0].airconOff();
        house[1].airconOn();

        System.out.println("0번째 배열 : " + house[0].airconStat);
        System.out.println("번째 배열 : " + house[1].airconStat);

        // ArrayList
        List<ClassHouseClass01> houseList = new ArrayList<ClassHouseClass01>();
    }
}
