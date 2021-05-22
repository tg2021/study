package ch04.calculator;

public class CalculatorClass08 {
    public static void main(String[] args) {
        // 시프트 연산자

        int first = 10;
        int second = 2;

        first = second >> 2;
        System.out.println("first : " + first);

        second = 2;
        first = second << 2;
        System.out.println("first << 2 : " + first);

        second = 2;
        first = second << 1;
        System.out.println("first << 1 : " + first);
    }
}
