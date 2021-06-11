package ch28.exception.exceptionpackage;

public class ExceptionMain02 {

    public void divideMath(int parameter) throws ArithmeticException {

        if(parameter > 12) {
            System.out.println("1년에는 12개월이 최대치입니다.");
            throw new ArithmeticException();
        } else {
            System.out.println("연봉 3억일 경우 월급이 얼마인지 계산합니다.");
            int calculateVale = 300000000 / parameter;
            System.out.println("월급 : " + calculateVale);
        }
    }

    public static void main(String[] args) {

        try {
            ExceptionMain02 main02 = new ExceptionMain02();
            main02.divideMath(12);
        } catch (ArithmeticException ae) {
            System.out.println("계산 예외가 발생하였습니다.");
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
            e.printStackTrace();
        }
    }
}
