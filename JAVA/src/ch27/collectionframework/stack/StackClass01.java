package ch27.collectionframework.stack;

import java.util.Stack;

public class StackClass01 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Integer push = stack.push(1);
        System.out.println("push return 값 : " + push);
        Integer push1 = stack.push(2);
        System.out.println("push1 return 값 : " + push1);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        //마지막 자료를 추출하고 해당 자료를 스택에서 삭제한다.
        Integer pop = stack.pop();
        System.out.println("pop 값 : " + pop);
        System.out.println(stack);

        // 스택에서 마지막 자료를 반환한다.
        Integer peek = stack.peek();
        System.out.println("stack : " + stack);
        System.out.println("peek : " + peek);

        int size = stack.size();
        for(int i = 0; i < size; i++) {
            Integer getPeek = stack.peek();
            System.out.println("getPeek : " + getPeek);
        }
    }
}
