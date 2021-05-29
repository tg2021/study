package ch13.opp.overloading;

public class MainMethod {
    public static void main(String[] args) {
        overloadingExam overloadingExam = new overloadingExam();

        int calculate = overloadingExam.calculate();
        int over1 = overloadingExam.calculate(1, 2);
        long over2 = overloadingExam.calculate(1, 3L);
        long over3 = overloadingExam.calculate(1L, 3);
        long over4 = overloadingExam.calculate(2L, 3L);
        
        System.out.println("calculate : " + calculate);
        System.out.println("over1 : " + over1);
        System.out.println("over2 : " + over2);
        System.out.println("over3 : " + over3);
        System.out.println("over4 : " + over4);
    }
}
