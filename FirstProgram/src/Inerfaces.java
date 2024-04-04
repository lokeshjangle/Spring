//Interface meaning in english is a point where two system meet and interact
//Interface in Java: a group of related method with empty bodies
//Interface is template for another classes
//Interface is a group of method jo har class ko use karna hi padega
interface Bicycle{
    int a = 12;
    void speedUp(int increment);
    void applyBreak(int decrement);
}

class HeroCycle implements Bicycle{ // implements keyword is use to implement interfaces
    void Horn(){
        System.out.println("Poo poo poo");
    }
    public void speedUp(int increment){
        System.out.println("Speed Up..");
    }
    public void applyBreak(int decrement) {
        System.out.println("Apply Breaks.");
    }

}

public class Inerfaces {
    public static void main(String[] args) {
        HeroCycle cycleLokesh = new HeroCycle();
        cycleLokesh.applyBreak(1);
        System.out.println(cycleLokesh.a); //You can create method or properties in Interface
        //NOTE: You cannot modify the properties in interface as they are final
        //cycleLokesh.a = 52;//This is false you cannot modify the properties in interfaces
    }
}
