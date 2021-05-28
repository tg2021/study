package ch10.opp.callbyvalue;

public class CallByReference {
    
    /*
        Call by reference

        메소드 호출 시 사용되는 인자 값의 메모리에 저장되어있는 주소(Address)를 복사하여 보낸다.
        값이 아니라 인자 그자체에 주소 값을 보낸다. 
    */
    public static int printiveMethod(int value) {
        return value += 1;
    }

    public static void main(String[] args) {
        
        int value = 0;
        System.out.println("value : " + value);

        int returnValue = printiveMethod(value);
        System.out.println("value : " + value);
        System.out.println("returnValue : " + returnValue);
        System.out.println();

        AClass aclass = new AClass();
        aclass.setValue(1);
        System.out.println("aclass 변수의 value 값 : " + aclass.getValue());
        
        CallByReferenceMethod(aclass);
        System.out.println("aClass의 파라미터를 이용한 변경시 value의 값 :" + aclass.getValue());
    }

    public static class AClass {
        private int value = 0;
        
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void CallByReferenceMethod(AClass aclass) {
        aclass.setValue(aclass.getValue() + 1);
    }
}
