package ch29.Thread.custom01;

public class CustomRunnable implements Runnable{

    private String message;
    private int time;

    public CustomRunnable(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(time);
                System.out.println("Runnable 메세지 : " + message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
