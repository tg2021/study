package ch05.array;

import java.util.Arrays;

public class ArrayClass03 {
    public static void main(String[] args) {
        
        String[] strArr = new String[3];
        strArr[0] = "정부";
        strArr[1] = "종힙";
        strArr[2] = "청사";
        System.out.println(Arrays.toString(strArr));

        String[] strArr1 = new String[] {"Hello", "world"};
        System.out.println(Arrays.toString(strArr1));
    
        double[] dbArray1 = new double[3];
        dbArray1[0] = 1.1;
        dbArray1[1] = 2.1;
        dbArray1[2] = 3.1;
        System.out.println(Arrays.toString(dbArray1));
    }
}
