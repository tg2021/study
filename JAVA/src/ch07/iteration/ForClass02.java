package ch07.iteration;

import java.util.ArrayList;
import java.util.List;

public class ForClass02 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for(int i : intList ) {
            System.out.println("i : " + i);
        }

        String[] arrStrCounty = new String[] {"한국", "미국", "중국", "러시아", "일본"};

        for(String StrCounty : arrStrCounty) {
            System.out.println("나라이름 : " + StrCounty);
        }
    }
}
