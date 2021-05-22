package ch04.calculator;

public class CalculatorClass01 {
    public static void main(String[] args) {
        
        byte sumByte1 = 2 + 2;
        short sumShort1 = 3 + 5;
        int symInt1 = 1 + 2;
        float sumFloat1 = 1.23f + 2.345f;
        double sumDouble = 1.1 + 2.345;

        System.out.println("sumByte1 : " + sumByte1);
        System.out.println("sumShort1 : " + sumShort1);
        System.out.println("symInt1 : " + symInt1);
        System.out.println("sumFloat1 : " + sumFloat1);
        System.out.println("sumDouble : " + sumDouble);

        int minInt1 = 10 - 2;
        System.out.println("minInt1 : " + minInt1);

        double mutDb1 = 10.1 * 2;
        System.out.println("mutDb1 : " + mutDb1);

        float divFlt1 = 10.0f / 3.0f;
        System.out.println("divFlt1 : " + divFlt1);

        float divFlt2 = 10 / 3;
        System.out.println("divFlt2 : " + divFlt2);

        double restDb1 = 10.0 % 3.0;
        System.out.println("restDb1 : " + restDb1);
    }
}
