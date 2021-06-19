package ch29.Thread.custom07;

public class ThreadMain {
    public static void main(String[] args) {

        // 우선순위 customThread1 > customThread2 > customThread3
        CustomThread customThread1 = new CustomThread(10);
        CustomThread customThread2 = new CustomThread(5);
        CustomThread customThread3 = new CustomThread(1);

        customThread1.start();
        customThread2.start();
        customThread3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        customThread1.setStop(true);
        customThread2.setStop(true);
        customThread3.setStop(true);
    }
}
