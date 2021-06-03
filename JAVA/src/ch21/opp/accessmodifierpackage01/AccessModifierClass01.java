package ch21.opp.accessmodifierpackage01;

public class AccessModifierClass01 {
    
    public String goodsName = "쌀";
    protected int goodsCount = 1;
    String goodsUnitName = "가마니";
    private int goodsPrice = 80000;

    public int getGoodsPrice() {
        return goodsPrice;
    }
    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    

}
