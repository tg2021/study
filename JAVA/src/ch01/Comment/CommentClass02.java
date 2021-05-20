package ch01.Comment;
/**
 * w주석 다는법
 * Comment클래스
 * 코드템플릿
 * @author : ktg
 * @date : 2021.05.19.
 */
public class CommentClass02 {
    /**
     * a메인메소드
     * @author : ktg
     * fate : 2021.05.19.
     * @param args
     * w주석 상세히 달것
     */
    public static void main(String[] args) {
        // 코드를 고쳤으면 주석최신화 해주기
        // 주석을 최신화 하지 않으면 주석다는 것이 단점이 될 수 있다.
        printMethod();
    }
    /**
     * 데이터 프린팅
     *  @author : ktg
     * @date : 2021.05.19
     */
    public static void printMethod() {
        System.out.println("프린팅 기능입니다.");
    }
}
