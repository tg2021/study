package ch21.opp.accessmodifierpackage02;

import ch21.opp.accessmodifierpackage01.AccessModifierClass01;

public class AccessModifierClass02Main extends AccessModifierClass01 {
    
    public static void main(String[] args) {
        
        AccessModifierClass02Main ExtendMain = new AccessModifierClass02Main();
        ExtendMain.showMethod();

    }

    public void showMethod() {
        String goodsName = super.goodsName;
        int goodsCount = super.goodsCount;

        System.out.println("상품 이름 : " + goodsName);
        System.out.println("상품 가격 : " + goodsCount);
    }
}
