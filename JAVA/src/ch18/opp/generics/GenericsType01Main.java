package ch18.opp.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericsType01Main {
    
    public static void main(String[] args) {
        
        GenericsType01<Integer> genericsType01 = new GenericsType01<Integer>(1);
        GenericsType01<String> genericsType02 = new GenericsType01<String>("사과");

        System.out.println(genericsType01.t);
        System.out.println(genericsType02.t);

        List<String> aList = new ArrayList<String>();
        aList.add("사과");
        aList.add("포도");

        List<Integer> bList = new ArrayList<Integer>();
        bList.add(1);
        bList.add(2);
    }
}
