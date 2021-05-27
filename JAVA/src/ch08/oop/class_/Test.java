package ch08.oop.class_;

public class Test {
	public static void main(String[] args) {
		
		String[] strNm = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
		
		for(String strVal : strNm) {
			System.out.println("strVal : " + strVal);
		}
		
		int[] intPr = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
		
		for(int intVal : intPr) {
			System.out.println("intVar : " + intVal);
		}
	}
}
