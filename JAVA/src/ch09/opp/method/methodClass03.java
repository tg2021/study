package ch09.opp.method;

public class methodClass03 {
    
    // 선언부
    void printInfo() {
        // void 반환타입, printInfo 메서드명 ()매개변수담는 공간
        //구현부
        System.out.println("Hello, world.");
    }

    void printInfo(String goodsName) {

    }

    int calculate(int quantity, int price) {
        int totalPrice = quantity + price;
        return totalPrice;
    }

    // int newInput 매개변수
    int addMaterial(int newInput) {

        //지역변수
        int remainValue = 0;
        remainValue = remainValue + newInput;
        return remainValue;
    }
}
