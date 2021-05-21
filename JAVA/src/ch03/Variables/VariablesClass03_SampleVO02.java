package ch03.Variables;

import java.util.Date;

public class VariablesClass03_SampleVO02 {
    
    public static void main(String[] args) {
        
        VariablesClass03_SampleVO01 sample1 = new VariablesClass03_SampleVO01();
        
        sample1.sampleBoolean = true;
        sample1.sampleChar = '가';
        sample1.sampleString = "한글";
        sample1.sampleByte = 1;
        sample1.sampleShort = 10;
        sample1.sampleInt = 100;
        sample1.sampleLong = 1000;
        sample1.sampleFloat = 1.1f;
        sample1.sampleDouble = 1.2345;

        System.out.println("boolean :" + sample1.sampleBoolean);
        System.out.println("char :" + sample1.sampleChar);
        System.out.println("String :" + sample1.sampleString);
        System.out.println("byte :" + sample1.sampleByte);
        System.out.println("short :" + sample1.sampleShort);
        System.out.println("int :" + sample1.sampleInt);
        System.out.println("long :" + sample1.sampleLong);
        System.out.println("float :" + sample1.sampleFloat);
        System.out.println("double :" + sample1.sampleDouble);
    
        Date date = new Date();
        System.out.println("date : " + date);
    }
}
