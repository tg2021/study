package ch08.oop.class_;

import ch08.oop.class_.PropertyOfClass.EnumDataType;

public class PropertyMain {
    public static void main(String[] args) {
        
        PropertyOfClass PropertyOfClass = new PropertyOfClass();
        PropertyOfClass PropertyOfClassHasName = new PropertyOfClass("커피");
        PropertyOfClass PropertyOfClassHasNamePrice = new PropertyOfClass("바나나", "1500");
        PropertyOfClassHasNamePrice.enumDataType = EnumDataType.INSERT;

        System.out.println();
        System.out.println(PropertyOfClass.toString());
        System.out.println(PropertyOfClassHasName.toString());
        System.out.println(PropertyOfClassHasNamePrice.toString());

        System.out.println();

        String[] innerClassPropertiesName = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
        for(String strVar : innerClassPropertiesName) {
            System.out.println("strVar : " + strVar);
        }

        System.out.println();

        int[] innerClassPropertiesPrice = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
    }
}
