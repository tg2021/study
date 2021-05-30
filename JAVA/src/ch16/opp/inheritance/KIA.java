package ch16.opp.inheritance;

public class KIA  extends CarParent{
    
    public void howManyWheel() {
        System.out.println(super.wheelCount);
    }

    public void howManyDoor() {
        System.out.println(super.doorCount);
    }
}
