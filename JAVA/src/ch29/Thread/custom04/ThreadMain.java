package ch29.Thread.custom04;

public class ThreadMain {

    public static void main(String[] args) {

        CustomThread customThread = new CustomThread();
        customThread.start();

        Thread thread = new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("tread suspend()");
                customThread.suspend();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println("tread resume()");
                customThread.resume();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println("thread stop()");
                customThread.stop();

                System.out.println("쓰레드 종료.");
            }
        };

        thread.start();
    }
}
