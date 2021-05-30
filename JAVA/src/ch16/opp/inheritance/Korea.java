package ch16.opp.inheritance;

public class Korea  extends Species {
    
    public String special = "분단국가이며 휴전국이다.";

    public void showDefault() {
        String species = super.species;
        String haveMust = super.haveMust;
        System.out.println("종 : " + species);
        System.out.println("필요한 것 " + haveMust);
    }

    @Override
    public void mainEat() {
        System.out.println("밥과 김치를 먹는다.");
    }

    
}
