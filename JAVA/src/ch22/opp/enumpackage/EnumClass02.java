package ch22.opp.enumpackage;

import java.util.Scanner;

public class EnumClass02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        while(true) {
            System.out.print("값을 입력하세요. : ");
            int scIn = scanner.nextInt();

            if(scIn == EnumClass01.CREATE.getIntValue()) {
                System.out.println("저장 입니다.");
            } else if(scIn == EnumClass01.READ.getIntValue()) {
                System.out.println("읽기 입니다.");
            } else if(scIn == EnumClass01.UPDATE.getIntValue()) {
                System.out.println("수정 입니다.");
            } else if(scIn == EnumClass01.DELETE.getIntValue()) {
                System.out.println("삭제 입니다.");
            } else {
                break;
            }

            // enum을 사용하는 이유는 특정한 값의 범위를 지정하기 위함이다.
        }
    }
}
