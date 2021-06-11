package ch28.exception.throwspackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsMain {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("c:/");
            /*
                여러개의 chatch구문을 통해 예외를 세부적으로 지정하는 것이 가능하다.
                이를 통해 더 자세한 예외 정보를 얻을 수 있다
             */
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
