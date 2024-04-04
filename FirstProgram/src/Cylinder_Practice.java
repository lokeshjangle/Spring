/*
    Ques:1) Create a class Cylinder and use getter and setter to set its radius and height
    Ques:2) Calculate surface area and Volume of the Cylinder
 */

class Cylinder{
    private int height;
    private int radius;

    //Create Getter and Setter
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    //Surface area of cylinder
    public double sufaceAreaCylinder(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    //Volume of cylinder
    public double volumeCylinder(){
        return (Math.PI)*(radius*radius*height);
    }
    //Math.PI = is return value of pi
}

public class Cylinder_Practice  {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println("Height of Cylinder is: "+myCylinder.getHeight());
        System.out.println("Radius of Cylinder is: "+myCylinder.getRadius());
        System.out.println("Total Surface of Area of Cylinder is: "+myCylinder.sufaceAreaCylinder());
        System.out.println("Volume of Cylinder is: "+myCylinder.volumeCylinder());
    }
}
