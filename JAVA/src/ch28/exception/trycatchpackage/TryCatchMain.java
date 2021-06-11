package ch28.exception.trycatchpackage;

public class TryCatchMain {

    public static void main(String[] args) {

        try{

            int divide = 10 / 5;
            System.out.println("나누기 : " + divide);

        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
