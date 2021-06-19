package ch29.Thread.synchronizecustom;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedThreadMain {
    public static void main(String[] args) {

        List<Integer> inList = new ArrayList<Integer>();

        Thread thread1 = new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }

                    synchronized (inList) {
                        if(inList.size() > 0) {
                            inList.remove(inList.size() - 1);
                        }
                    }
                }

            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }

                    synchronized (inList) {
                        if(inList.size() > 0) {
                            System.out.println(inList);
                            System.out.println("List의 마지막 값 : " + inList.get(inList.size() - 1));
                        }
                    }
                }

            }
        };

        Thread thread3 = new Thread() {
            public void run() {
                int count = 0;
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }

                    synchronized (inList) {
                        inList.add(count);
                    }

                    count++;
                    boolean alive1 = thread1.isAlive();
                    boolean alive2 = thread1.isAlive();

                    if(alive1 == false || alive2 == false || count == 3000) {
                        System.out.println("count가 3000입니다.");
                        thread1.interrupt();
                        thread2.interrupt();
                        interrupt();
                    }
                }

            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
