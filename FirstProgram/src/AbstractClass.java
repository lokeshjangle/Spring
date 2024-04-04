//Abstract Class:Abstract class is nothing but in class abstract method is present and it denoted by abstract keyword
//Abstract Meaning in english: Existing in thought or as an idea without concrete existance
//Abstract Method: A method that is declared without an implementation
//    Syntax: abstract void moveTO(double x,double y);
//If the class include abstract method, then the class itself must be declared abstract class, as in
//Syntax: abstract class PhoneModel{
//                  abstract void switchOff(){};}
//Abstract class is set a standard of method using abstract class you can create a multiple classes with same method
//Note: Abstract class never been call it can access only using child classes
//Note:  for creating a child class or concrete class from abstract class, it required to use all abstract method in abstract class

abstract class Parent2{ //Abstract class
    public Parent2(){
        System.out.println("I am the constructor of Base 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2{ //Concrete class of abstract class
    @Override
    public void greet(){
        System.out.println("Good Morning1!!");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); // You cannot create object of abstract class
        Child2 c = new Child2();
        c.greet();
    }
}
