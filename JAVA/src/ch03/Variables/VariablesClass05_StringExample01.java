package ch03.Variables;

public class VariablesClass05_StringExample01 {
    public static void main(String[] args) {
        String companyName = "한국";
        System.out.println("companyName : " + companyName);

        String cctCompanyName = companyName + "전력";
        System.out.println("cctCompanyName : " + cctCompanyName);

        String country1 = "한국";
        String country2 = "한국";
        boolean boolean1 = country1 == country2;
        System.out.println("boolean1 : " + boolean1);

        // new연산자로 객체를 생성해서 false가 나온다
        String strCountry1 = new String("한국");
        String strCountry2 = new String("한국");
        boolean boolean2 = strCountry1 == strCountry2;
        System.out.println("boolean2 : " + boolean2);

        // 문자열 비교는 equals사용(참조형변수)
        boolean boolEquals1 = strCountry1.equals(strCountry2);
        System.out.println("boolEquals1 : " + boolEquals1);
        
        StringBuilder sbVar = new StringBuilder("한국");
        sbVar.append("전력");
        System.out.println("sbVar.toString : " + sbVar.toString());

        StringBuffer stringBuffer = new StringBuffer("수자원");
        stringBuffer.append("공사");
        System.out.println("stringBuffer : " + stringBuffer.toString());
    }
}
