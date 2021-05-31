package ch20.oop.abstractpackage;

public class AbstractClassMain {
    public static void main(String[] args) {
        AbstractClass02 abstractClass02 = new AbstractClass02();
        AbstractClass03 abstractClass03 = new AbstractClass03(); 
        AbstractClass04 abstractClass04 = new AbstractClass04(); 

        abstractClass04.showCompName();
        abstractClass04.showLoc();
        
        abstractClass03.showCompName();
        abstractClass03.showLoc();
        
        abstractClass02.showCompName();
        abstractClass02.showLoc();
    }

}
