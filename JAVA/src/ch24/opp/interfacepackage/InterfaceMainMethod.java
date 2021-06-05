package ch24.opp.interfacepackage;

import ch25.opp.innerclass.InnerClass01;

public class InterfaceMainMethod {
    
    public static void main(String[] args) {
        /*
        11버전 아래는 실행되지 않는다
        InterfaceClass01 sampleClass = new InterfaceClass01();

        sampleClass.abstractMethod();
        sampleClass.defaultMethod();
        sampleClass.interfaceMethod();
        
        String strOsName = sampleClass.OS_NAME;
        String strDownloadPath = sampleClass.DownLoad_PATH;

        System.out.println("OS name : " + strOsName);
        System.out.println("downloard Path : " + strDownloadPath);
        */
        InterfaceClass01.sampleFirst sampleFirst = new InterfaceClass01.sampleFirst();
        int sampleCount = sampleFirst.sampleCount;
        System.out.println("sampleCount : " + sampleCount);

        /*
        InterfaceClass01.D create = InnerClass01.D.CREATE;
        InterfaceClass01.D read = InnerClass01.D.READ;
        InterfaceClass01.D update = InnerClass01.D.UPDATE;
        InterfaceClass01.D delete = InnerClass01.D.DELETE;
        System.out.println("create : " + create);
        System.out.println("read : " + read);
        System.out.println("update : " + update);
        System.out.println("delete : " + delete);
        */
    }
}
