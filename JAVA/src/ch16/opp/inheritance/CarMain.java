package ch16.opp.inheritance;

public class CarMain {
    public static void main(String[] args) throws Exception {
        
        Hyundai hyundai = new Hyundai();
        KIA kia = new KIA();


        hyundai.howManyWheel();
        hyundai.howManyDoor();

        kia.howManyWheel();
        kia.howManyDoor();
    }
}
