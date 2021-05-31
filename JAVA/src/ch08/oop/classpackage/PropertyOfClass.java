package ch08.oop.classpackage;

public class PropertyOfClass {

    

    public static final String[] innerClassPropertiesName = null;

    // 정적전역변수
    public static int entityCount;

    // 전역변수
    public String goodsNo;
    public String goodsName;
    public String goodsPrice;

    /*
        정적전역변수와 전역변수의 차이

        전역변수는 각 객체마다 고유한 값을 가진다
    */

    // enum : 특정값을 정의하여 해당값만 사용한다
    public enum EnumDataType {
        INSERT, UPDATE, DELETE, NORMAL 
    }

    public EnumDataType enumDataType = EnumDataType.NORMAL;

    static {
        System.out.println("Goods ::: 정적초기화 실행");
        System.out.println("Goods entity Count : " + entityCount);
        System.out.println("Goods ::: 정적초기화가 여러번 실행될까요?");
    }

    // 초기화 블럭 : 무언가를 초기화하고 싶을때 사용되는 구간
    // 생성자 함수보다 먼저 호출
    {
        System.out.println("초기화블럭을 실행합니다.");
        entityCount++;

        goodsNo = "goods" + entityCount;

        System.out.println("상품번호 : " + goodsNo);

    }

    public PropertyOfClass() {
        System.out.println("기본 생성자 함수를 실행합니다.");
    }

    public PropertyOfClass(String goodsName) {
        // 파라미터를 가진 생성자
        this.goodsName = goodsName;
    }

    public  PropertyOfClass(String goodsName, String goodsPrice) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() { 
        /*
        toString : 어떤 클래스의 전역변수값을 확인할때 사용
        해당 객체의 전역변수값을 확인할 때
        */
        return "PropertyOfClass [goodsNo=" + goodsNo + ",goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
    }
    
    public static class InnerClassInfo{
        public static String[] innerClassPropertiesName = new String[] {"상품번호", "상품명", "단가"};
        public static int[] innerClassPropertiesPrice = new int[] {100, 1000, 2500, 3500};
    }
}
