package ch09.opp.method;

public class methodClass03DynamicArrayTest {
    
    public static void main(String[] args) {
        
        methodClass03DynamicArray dArray = new methodClass03DynamicArray();
        dArray.dynamicMethod("Grape", "WaterMelon", "Apple", "Orange");

        dArray.dynamicMethod(new String[] {"samsung", "SK", "현대", "LG"});
    }
}
