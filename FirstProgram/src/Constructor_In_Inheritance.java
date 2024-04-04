//Constructor in Inheritance
//In Inheritance the constructor of base class will execute first then constructor of derived class will execute


//NOTE:
//super(0); //super keyword is use for execute the base class constructor which have arguments
//super is use to pass argument in base class constructor from derived class

class Base1{
    Base1(){
        System.out.println("I am a Base class constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor of Base with value of a as: "+a );
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0); //super keyword is use for execute the base class constructor which have arguments
                    //super is use to pass argument in base class constructor from derived class
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int a , int b){
        super(a);
        System.out.println("I am a overloaded constructor of Derived class with value of b as: " +b);
    }

}

class chileDerived extends Derived1{
    chileDerived(){
        System.out.println("I am Child Derived Class Constructor");
    }
    chileDerived(int a , int b, int c){
        super(a, b);
        System.out.println("I am a overloaded constructor of Child Derived Class with value of c as: "+c);
    }
}
public class Constructor_In_Inheritance {
    public static void main(String[] args) {
     //   Base1 b = new Base1();
       // Derived1 d = new Derived1();
        //Derived1 d = new Derived1(14,9);
       // chileDerived ch = new chileDerived();
        chileDerived ch = new chileDerived(12,8,2001);
    }
}
