package ch14.opp.overriding;

public class OverridingChild01 extends OverridingParent{

    @Override
    public String showCompany() {
        // super는 상속받은 부모클래스를 가리킨다.
        // super가 현재 가리키는 것은 부모클래스인 OverridingParent이다.
        String parentString = super.showCompany();
        parentString = "삼성" + parentString;
        return parentString;
    }
    
}
