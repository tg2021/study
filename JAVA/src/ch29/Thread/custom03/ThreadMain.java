package ch29.Thread.custom03;

public class ThreadMain {

    // Interrupted 는 Thread를 종료시킬때 자주 사용한다.

    // 3초가 지나면 종료료
   public static void main(String[] args) {
        Thread thread = new CustomThread();
        thread.start();
        try {
            Thread.sleep(3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
