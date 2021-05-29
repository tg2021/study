package ch15.opp.constructor;

public class ConstructorTwoMain {
    
    public static void main(String[] args) {
        
        ConstructorTwo sample = new ConstructorTwo();
        sample.cpuName = "amd";
        sample.gpuName = "rdeon";

        System.out.println(sample.cpuName);
        System.out.println(sample.gpuName);

        System.out.println();

        ConstructorTwo constructorTwo = new ConstructorTwo("intel", "nvd");
        System.out.println(constructorTwo.cpuName);
        System.out.println(constructorTwo.gpuName);

        System.out.println();

        ConstructorTwo constructorTwo1 = new ConstructorTwo("intel", "nvd");
        ConstructorTwo constructorTwo2 = new ConstructorTwo(constructorTwo);

        System.out.println(constructorTwo1.cpuName);
        System.out.println(constructorTwo1.gpuName);

        System.out.println("=====================");

        System.out.println(constructorTwo2.cpuName);
        System.out.println(constructorTwo2.gpuName);

        System.out.println();

        constructorTwo2.cpuName = "amd";
        constructorTwo2.gpuName = "radeon";

        System.out.println(constructorTwo1.cpuName);
        System.out.println(constructorTwo1.gpuName);
        System.out.println("=====================");
        System.out.println(constructorTwo2.cpuName);
        System.out.println(constructorTwo2.gpuName);
    }
}
