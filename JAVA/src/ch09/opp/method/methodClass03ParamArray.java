package ch09.opp.method;

public class methodClass03ParamArray {
    
    public void printInfoParamArray(String[] strParamArray) {
        for(String strParam : strParamArray) {
            System.out.println("strParam : " + strParam);
        }
    }
}
