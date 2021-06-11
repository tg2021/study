package ch28.exception.exceptionpackage;

public class ExceptionMain01 {

    public void showMsg() throws Exception {

        System.out.println("안녕하세요.");
        int divide = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            ExceptionMain01 exceptionMain = new ExceptionMain01();
            exceptionMain.showMsg();
        } catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
