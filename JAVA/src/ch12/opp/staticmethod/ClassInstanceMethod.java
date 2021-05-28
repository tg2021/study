package ch12.opp.staticmethod;

public class ClassInstanceMethod {
    
    static int staticSum(int paramOne, int paramTwo) {
        return paramOne + paramTwo;
    }

    static int staticAverage(int paramOne, int paramTwo) {
        return (paramOne + paramTwo) / 2;
    }

    static int entitySum(int paramOne, int paramTwo) {
        return paramOne + paramTwo;
    }

    static int entityAverage(int paramOne, int paramTwo) {
        return (paramOne + paramTwo) / 2;
    }
}
