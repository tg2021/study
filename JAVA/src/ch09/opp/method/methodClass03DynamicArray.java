package ch09.opp.method;

import java.util.Arrays;

public class methodClass03DynamicArray {
    
    public void dynamicMethod(String...msgParameter) {
        String[] strArray = msgParameter;
        System.out.println(Arrays.toString(strArray));
    }

}
