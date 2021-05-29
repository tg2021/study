package ch15.opp.constructor;

public class ConsOneMain {
    public static void main(String[] args) {
        

        ConsSampleOne consSampleOne = new ConsSampleOne();
        consSampleOne.cpuName = "intel";
        consSampleOne.gpuName = "nvd";

        System.out.println(consSampleOne.cpuName);
        System.out.println(consSampleOne.gpuName);
    }
}
