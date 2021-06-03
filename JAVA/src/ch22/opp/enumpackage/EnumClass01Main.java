package ch22.opp.enumpackage;

public class EnumClass01Main {
    
    public static void main(String[] args) {
        
        EnumClass01 eCreate = EnumClass01.CREATE;
        EnumClass01 eRead = EnumClass01.READ;
        EnumClass01 eUpdate = EnumClass01.UPDATE;
        EnumClass01 eDelete = EnumClass01.DELETE;

        System.out.println("저장 : " + eCreate.getStrName());
        System.out.println("읽기 : " + eRead.getStrName());
        System.out.println("수정 : " + eUpdate.getStrName());
        System.out.println("삭제 : " + eDelete.getStrName());
        
        int kindLogicValue = 1;
        // int kindLogicValue = 2;
        // int kindLogicValue = 3;
        // int kindLogicValue = 4;
    
        if (EnumClass01.CREATE.getIntValue() == kindLogicValue) {
            System.out.println("저장 로직입니다.");
        } else if(EnumClass01.READ.getIntValue() == kindLogicValue) {
            System.out.println("읽기 로직입니다.");
        } else if(EnumClass01.UPDATE.getIntValue() == kindLogicValue) {
            System.out.println("수정 로직입니다.");
        } else if(EnumClass01.DELETE.getIntValue() == kindLogicValue) {
            System.out.println("삭제 로직입니다.");
        }
    }

}
