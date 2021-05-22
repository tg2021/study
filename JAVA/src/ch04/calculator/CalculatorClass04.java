package ch04.calculator;

public class CalculatorClass04 {
    public static void main(String[] args) {
        //  while문
        int whileCnt = 0;
        while(whileCnt < 5) {
            System.out.println("반복문++ : " + whileCnt++ + "입니다.");
        }
        System.out.println();
        whileCnt = 0;
        while(whileCnt < 5) {
            System.out.println("++반복문 : " + ++whileCnt + "입니다." );
        }
        System.out.println();
        
        // for문
        int forCnt = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("++반복문 : " + ++forCnt);
        }
        System.out.println();
        forCnt = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("++반복문 : " + forCnt++);
        }
    }
}
