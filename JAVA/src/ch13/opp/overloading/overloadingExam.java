package ch13.opp.overloading;

public class overloadingExam {
    public static void main(String[] args) {
        /*
            오버로딩 : 같은 메서드 이름에 여러개의 형태로 선언할 수 있는 것
        */
    }

    public int calculate() {
        return 1 + 2;
    }

    public int calculate(int one, int two) {
        return one + two;
    }

    public long calculate(long one, long two) {
        return one + two;
    }

    public long calculate(int one, long two) {
        return one + two;
    }

    public long calculate(long one, int two) {
        return one + two;
    }

    public long calculateLong(long one, long two) {
        return one + two;
    }
}
