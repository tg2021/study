package ch15.opp.constructor;

public class ConstructorTwo {

    public String cpuName;
    public String gpuName;

    ConstructorTwo() {
        this("amd", "radeon");
    }

    // 생성자 명으로 지정하면 에러가 난다.
    ConstructorTwo(String cpuName) {
        // 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만 호출가능
        this(cpuName, "nvd");
        cpuName = "intel";
    }

    ConstructorTwo(String cpuName, String gpuName) {
        this.cpuName = cpuName;
        this.gpuName = gpuName;
    }

    // 생성자를 이용한 객체 복사
    ConstructorTwo(ConstructorTwo consTwo) {
        this.cpuName = consTwo.cpuName;
        this.gpuName = consTwo.gpuName;
    }
}
