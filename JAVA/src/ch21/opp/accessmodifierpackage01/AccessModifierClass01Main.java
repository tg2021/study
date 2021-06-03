package ch21.opp.accessmodifierpackage01;

public class AccessModifierClass01Main {
    public static void main(String[] args) {
        AccessModifierClass01 goodsVO = new AccessModifierClass01();
        goodsVO.goodsName = "김치";
        goodsVO.goodsCount = 2; 
        goodsVO.goodsUnitName = "봉지";

        int goodsPrice = goodsVO.getGoodsPrice();
        System.out.println("상품 가격 : " + goodsPrice);

        goodsVO.setGoodsPrice(10000);
        int gp = goodsVO.getGoodsPrice();
        System.out.println("상품 가격 : " + gp);
    }
}
