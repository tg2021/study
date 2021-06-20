package ch29.Thread.custom10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

    public static void main(String[] args) {

        ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
        Callable<String> call1 = new CustomCallable();
        Callable<String> call2 = new CustomCallable();
        Callable<String> call3 = new CustomCallable();

        List<Callable<String>> callableList = new ArrayList<Callable<String>>();
        Collections.addAll(callableList, call1, call2, call3);

        try {
            List<Future<String>> invokeAllList = executorServicePool.invokeAll(callableList);
            System.out.println(invokeAllList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
