package ch03.variables;

public class VariablesClass01 {
    public static void main(String[] args) {
        
        // 변수선언했지만 메모리에 할당되진 않는다
        int amount;

        // 메모리에 1000이라는 값을 할당하고 1000이라는 주소값을 amount가 가지고있다.
        amount = 1000;

        // 변수의 명명과 동시에 값을 지정하는 방식, 초기화
        int price = 2000;

        // 한번에 여러개의 변수를 선언하는 방식 (가독성이 떨어지므로 권장하지 않음)
        String buldingName, schoolCount, companyLocation;

        // 한번에 여러개의 변수를 선언하고 값을 할당하는 방식 (가독성이 떨어지므로 권장하지 않음)
        int fruitCount = 10, cashAmount = 1000, bookSeries = 3;
    }
}
