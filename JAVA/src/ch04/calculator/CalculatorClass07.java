package ch04.calculator;

public class CalculatorClass07 {
    public static void main(String[] args) {
        
        // 연산자 우선순위
        double calData1 = (1.0 + 2.0) / 2.0;
        double calData2 = 1.0 + 2.0 / 2.0;

        System.out.println("calData1 : " + calData1);
        System.out.println("calData2 : " + calData2);

        calData1 = 1 + 2 / 3 - 4 * 5;
        calData2 = 1 + 2 / 3 - 4 * 5;
        double calData3 = 1 + 2 / 3 - 4 * 5;

        System.out.println("calData1 : " + calData1);
        System.out.println("calData2 : " + calData2);
        System.out.println("calData3 : " + calData3);

        calData1 = (1 + 2) / (3 - 4) * 5;
        calData2 = 1 + (2 / 3) - 4 * 5;
        calData3 = 1 + 2 / ((3 - 4) * 5);

        System.out.println("괄호 묶고 calData1 : " + calData1);
        System.out.println("괄호 묶고 calData2 : " + calData2);
        System.out.println("괄호 묶고 calData3 : " + calData3);

        calData1 = 1 + 2;
        calData1 = calData1 / 3;
        System.out.println("계산 calData1 : " + calData1);
    }
}
