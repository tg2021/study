package ch22.opp.enumpackage;

import java.util.Scanner;

public class EnumClass03Main {
    
    public static void main(String[] args) {
        
        
        while(true) {
            System.out.print("요일을 입력하세요. : ");
            Scanner scanner = new Scanner(System.in);
            String strNext = scanner.next();
            

            
            if(strNext.equals(EnumClass03.MON.strName)) {
                System.out.println("월요일 입니다.");
            }  else if(strNext.equals(EnumClass03.TUE.strName)) {
                System.out.println("화요일 입니다.");
            } else if(strNext.equals(EnumClass03.WED.strName)) {
                System.out.println("수요일 입니다.");
            } else if(strNext.equals(EnumClass03.THU.strName)) {
                System.out.println("목요일 입니다.");
            } else if(strNext.equals(EnumClass03.FRI.strName)) {
                System.out.println("금요일 입니다.");
            } else if(strNext.equals(EnumClass03.SAT.strName)) {
                System.out.println("토요일 입니다.");
            } else if(strNext.equals(EnumClass03.SUN.strName)) {
                System.out.println("일요일 입니다.");
            } 
        }
    }
}