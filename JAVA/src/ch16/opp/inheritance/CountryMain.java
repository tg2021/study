package ch16.opp.inheritance;

public class CountryMain {
    
    public static void main(String[] args) {
        Korea korea = new Korea();
        China china = new China();

        System.out.println(korea.species);
        System.out.println(korea.haveMust);
        System.out.println(korea.special);
        korea.showDefault();
        korea.mainEat();

        System.out.println();

        System.out.println(china.species);
        System.out.println(china.haveMust);
        System.out.println(china.haveMust);
        china.showDefault();
        china.mainEat();
    }
}
