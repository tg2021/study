package ch14.opp.overriding;

public class OverridingChild02 extends OverridingParent{

    @Override
    public String showCompany() {
        String pStr = super.showCompany();
        pStr = "LG" + pStr;
        return pStr;

        
    }
    
}
