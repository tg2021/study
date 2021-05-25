package ch07.iteration;

public class DoWhileClass {
    public static void main(String[] args) {
        int intTest = 0;

        do {
            System.out.println("인덱스 : " + intTest);
            intTest++;
        } while (intTest < 5);

        System.out.println();
        
        intTest = 0;
        
        // 조건문이 맞지 않아도 한번은 실행
        do {
            System.out.println("인덱스 : " + intTest);
            intTest++;
        } while (intTest < 0);

        System.out.println();

        do {
            System.out.println("무조건 한 번은 실행합니다.");
        } while (false);

    }
}
