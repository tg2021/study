package ch14.opp.overriding;

public class MainMethod {
    public static void main(String[] args) {
        OverridingChild01 overridingChild = new OverridingChild01();
        String reStr = overridingChild.showCompany();

        System.out.println("reStr : " + reStr);

        OverridingChild02 overridingChild02 = new OverridingChild02();
        String lgStr = overridingChild02.showCompany();

        System.out.println("lgStr : " + lgStr);

        OverridingParent overridingParent = new OverridingParent();
        String pStr = overridingParent.showCompany();

        System.out.println("pStr : " + pStr);

        
    }
}
