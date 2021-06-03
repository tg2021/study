package ch21.opp.accessmodifierpackage02;

import ch21.opp.accessmodifierpackage01.AccessModifierClass01;

public class Main {
    public static void main(String[] args) {
        
        AccessModifierClass01 goodsVO = new AccessModifierClass01();
        goodsVO.goodsName = "나물";

        System.out.println("상품 가격 : " + goodsVO.getGoodsPrice());
        goodsVO.setGoodsPrice(1000);
        System.out.println("변경된 상품 가격 : " + goodsVO.getGoodsPrice());
    }
}
