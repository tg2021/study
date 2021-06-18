package ch29.Thread.custom04;

public class CustomThread extends Thread {

    public void run() {
        int count = 0;
        Thread thread = Thread.currentThread();
        while (true) {
            System.out.println("쓰레드가 동작중입니다.");
            try {
                String threadName = thread.getName();
                System.out.println("쓰레드 이름 : " + threadName + "=====>" + count);
                count++;
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
