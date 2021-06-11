package ch27.collectionframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClassMain {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("엔진사업부");
        queue.offer("플렌트사업부");
        queue.offer("방산산업부");
        queue.offer("조선자업부");
        queue.offer("로봇산업부");
        queue.offer("에너지사업부");

        System.out.println(queue);

        int size = queue.size();
        for(int i = 0; i < size; i++) {
            String poll = queue.poll();
            System.out.println("추출된 값 : " + poll);
        }
        // 값을 출력해서 빈값이다.
        System.out.println(queue);

        queue.add("리조트파트");
        queue.add("호텔파트");
        queue.add("비지니스호텔파트");
        queue.add("면세점파트");
        queue.add("테마파크파트");
        System.out.println(queue);

        for(int i = 0; i <queue.size(); i++) {
            String peek = queue.peek();
            System.out.println("추출된 값 : " + peek);
        }

    }

}
