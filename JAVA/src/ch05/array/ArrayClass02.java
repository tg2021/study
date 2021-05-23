package ch05.array;

import java.util.Arrays;

public class ArrayClass02 {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        int one = arr[0];
        int two = arr[1];
        int three = arr[2];

        System.out.println("one : " + one);
        System.out.println("two : " + two);
        System.out.println("three : " + three);
    }
}
