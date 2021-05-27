package ch08.oop.class_;

public class PropertyMain {
    public static void main(String[] args) {
        
        PropertyOfClass PropertyOfClass = new PropertyOfClass();
        PropertyOfClass PropertyOfClassHasName = new PropertyOfClass("커피");
        PropertyOfClass PropertyOfClassHasNamePrice = new PropertyOfClass("바나나", "1500");
        PropertyOfClassHasNamePrice.enumDataType = PropertyOfClass.enumDataType.INSERT;

        System.out.println();
        System.out.println(PropertyOfClass.toString());
        System.out.println(PropertyOfClassHasName.toString());
        System.out.println(PropertyOfClassHasNamePrice.toString());

        String[] strNm = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
		
		for(String strVal : strNm) {
			System.out.println("strVal : " + strVal);
		}
		
		int[] intPrice = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
		
		for(int intVal : intPrice) {
			System.out.println("intVar : " + intVal);
		}
    }
}
