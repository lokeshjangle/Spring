//Create a custom class
class Employee{
    int id;
     String name;
     int salary;
     public void PrintDetails(){
         System.out.println("My id is: "+id);
         System.out.println("My name is: "+name);
         System.out.println("My Salary is: "+salary);
     }
}
public class Custom_Class {
    public static void main(String[] args){
        System.out.println("This is custom class program");
        Employee lokesh = new Employee();  //Initiating a new Employee object
        Employee shubham = new Employee();
        //String Attribute for lokesh
        lokesh.id = 12;
        lokesh.name = "lokesh Jangale";
        lokesh.salary = 50000;
        lokesh.PrintDetails();

        //String Attribute for shubham
        shubham.id = 15;
        shubham.name = "Shubham Kolate";
        shubham.salary = 75000;
        shubham.PrintDetails();
    }
}
