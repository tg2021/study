package ch29.Thread.custom09;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    private String name;

    public CustomCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        int index = 0;
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

            System.out.println(index + " ::: " + name);
        }
        return null;
    }
}
