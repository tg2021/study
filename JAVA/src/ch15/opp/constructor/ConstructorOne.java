package ch15.opp.constructor;

public class ConstructorOne {
    
    public String cpuName;
    public String gpuName;

    ConstructorOne() {
        System.out.println("기본 생성자가 실핼되었습니다.");
    }

    ConstructorOne(String cpuName, String gpuName) {
        System.out.println("파라미터가 있는 생성자");
    }
}
