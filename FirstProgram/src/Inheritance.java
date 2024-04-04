
//Base class is also called as parent class and superclass
class Base{
    int x;

    public int getX() {
        System.out.println("This is base class and I set value of x");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
//Derive class also called as child class and sub-class
//Extends keyword is use to access properties of base class
class Derived extends Base{
    int y;

}

public class Inheritance {
    public static void main(String[] args) {
        //Create a Base class object
        Base b = new Base();
        b.setX(12);
        System.out.println(b.getX());

        //Create a derived class object to access base class
        Derived d = new Derived();
        System.out.println("Using Derived class access base class");
        d.setX(13);
        System.out.println(d.getX());

    }
}
