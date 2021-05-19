package ch01_Comment;


public class CommentClass01 {
    public static void main(String[] args) {
        mathodOne();
        mathodTwo();

    }

    public static void mathodOne() {
        System.out.println("안녕하세요");
        System.out.println("비지니스 로직이 수행됩니다.");
        int one = 10;
        int two = 20;
        int three = 5;
        three = one + two;
        System.out.println("결과값은 : " + three);
    }

    public static void mathodTwo() {
        System.out.println("안녕하세요");
        System.out.println("비지니스 로직이 수행됩니다.");
        //int one = 10;
        //nt two = 20;
        int three = 5;
        //three = one + two;
        System.out.println("결과값은 : " + three);
    }
}
