package ch08.oop.classpackage;

public class ClassHouseTestClass01 {
    public static void main(String[] args) {

        // ClassHouseClass01의 객체의 주소값을 저장해서 house로 변수명으로 사용
        ClassHouseClass01 house = new ClassHouseClass01();
        ClassHouseClass01 houseAnother = new ClassHouseClass01();
        // 각각 고유의 값을 가지기때문에 에어컨1과 에어컨2의 값이 다르게 나온다
        System.out.println("에어컨1 : " + house.airconStat);
        System.out.println("에어컨2 : " + houseAnother.airconStat);

        house.airconOn();
        System.out.println("에어컨1 : " + house.airconStat);
        System.out.println("에어컨2 : " + houseAnother.airconStat);

        house.airconOff();
        System.out.println("에어컨1 : " + house.airconStat);
        System.out.println("에어컨2 : " + houseAnother.airconStat);
    }
}
