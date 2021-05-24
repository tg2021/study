package ch06.ifstatement;

public class IfClass01 {
    
    public static void main(String[] args) {
        
        int fruitCase = 10;
        String caseOne = "구매합니다.";
        String csaeTwo = "구매하지 않습니다.";

        if(fruitCase > 9) {
            System.out.println(csaeTwo);
        } else {
            System.out.println(caseOne);
        }

        int cashAmount = 3000;
        if(cashAmount < 5000) {
            System.out.println("현금을 인출합니다");
        }
    }
}
