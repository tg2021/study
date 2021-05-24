package ch06.switchstatement;

import java.util.Scanner;

public class SwitchClass01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("접근하려는 시설 보안 등급 : ");
        String strBuildingSecurityGrade = scanner.next();

        System.out.println("시설 접근 권한을 평가합니다.");

        switch (strBuildingSecurityGrade) {
            case "A":
                System.out.println("A등급입니다.\n보안 2등급 이상 소지자만 접근할 수 있습니다.");
                break;
            case "B":
                System.out.println("B등급입니다.\n보안 3등급 이상 소지자만 접근할 수 있습니다.");
                break;
            case "C":
                System.out.println("C등급입니다.\n대외비입니다. 직원만 접근할 수 있습니다.");
                break;
                default:
                    System.out.println("급이 없습니다.\n등급 외입니다. 접근 제한이 없습니다.");
        }
        
        
    }
}
