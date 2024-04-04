//Create a class square with a method to initialize its side, calculating area, perimeter etc

import java.util.Scanner;

class findsquare{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Circle{
    int radius;
    float pie = 3.14f;
    public float area(){
        return pie*radius*radius;
    }
    public float perimeter(){
        return  2*pie*radius;
    }
}
public class Square {
    public static void main(String[] args) {
        findsquare sq = new findsquare();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        sq.side = sc.nextInt();
        System.out.println("Area Of Square is: "+sq.area());
        System.out.println("Perimeter of Square is: "+sq.perimeter());

        //Rectangle
        Rectangle rect = new Rectangle();
        System.out.println("Enter the length: ");
        rect.length = sc.nextInt();
        System.out.println("Enter the Breath: ");
        rect.breadth = sc.nextInt();
        System.out.println("Area of Rectangle: "+rect.area());
        System.out.println("Perimeter of Rectangle: " +rect.perimeter());

        //Cirlce
        Circle cir = new Circle();
        System.out.println("Enter the radius: ");
        cir.radius = sc.nextInt();
        System.out.println("Area of Circle: "+cir.area());
        System.out.println("Perimeter of Circle: " +cir.perimeter());

    }
}
