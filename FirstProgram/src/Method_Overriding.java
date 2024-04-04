//Method Overriding: if the child class which extends from parent class and use same method which is use in parent class is called method overriding
//Overriding means you can use same name of method in child class which you use in parent class
class A{
    int a;
    public void state(){  //This is actual method
        System.out.println("This is a method of Class A");
    }
}
class B extends A{
    @Override  //Override keyword is denote the function or method was override from parent class
    public void state(){ //This is override method of parent class
        System.out.println("This is a method of Class B");
    }
}


public class Method_Overriding {
    public static void main(String[] args){
        A a = new A();
        a.state();
        B b = new B();
        b.state();
    }
}
