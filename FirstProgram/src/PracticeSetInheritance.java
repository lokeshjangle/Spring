//Create a class circle and use inheritance to create another class Cylinder from it
class Circle1{
    public int radius;
    Circle1(int r){
        this.radius=r;
    }
    public double area(){
        System.out.println("The area of circle is: ");
        return  Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        this.height=h;
        this.radius=r;
        System.out.println(this.height);
        System.out.println(this.radius);
    }
    public double volume(){
        System.out.println(this.height);
        System.out.println(this.radius);
        System.out.println("The volume of Cylinder is: ");
        return (Math.PI*this.radius*this.radius*this.height);
    }
}
public class PracticeSetInheritance {
    public static void main(String[] args) {
        Cylinder1 cy = new Cylinder1(4,6);
        cy.area();
        cy.volume();
    }
}
