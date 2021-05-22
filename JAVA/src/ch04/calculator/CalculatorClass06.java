package ch04.calculator;

public class CalculatorClass06 {
    public static void main(String[] args) {
        //논리연산자

        int first = 10;
        int second = 50;

        boolean cmpOrCondition = (first == 10) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        cmpOrCondition = (first == 20) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        cmpOrCondition = (first == 20) || (second == 60);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        first = 10;
        second = 20;
        cmpOrCondition = ((first > 9) && (second < 21));
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        first = 1;
        second = 5;
        cmpOrCondition = ((first < 1) && (second > 6));
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        cmpOrCondition = ((first > 2) && (second < 6));
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        first = 2;
        second = 4;

        cmpOrCondition = first !=2;
        System.out.println("cmpOrCondition 2가 아니다 : " + cmpOrCondition);

        cmpOrCondition = first !=1;
        System.out.println("cmpOrCondition 1이 아니다 : " + cmpOrCondition);   
    }
}
