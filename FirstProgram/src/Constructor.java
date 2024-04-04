//Constructor: Constructor means the program which called automatically
// --> The constructor name and class name are same


class MyEmployee{
    private int id;
    private String name;
    private int salary;
    public MyEmployee(){  //create constructor: the name of constructor is same as a class name
        id = 11;
        name = "Shubham Kolate";
    }
    //In constructor we can also use method overloading which means we create same constructor with same name but diff. arguments
    public MyEmployee(int myId,String myName, int Salary){  //create constructor: the name of constructor is same as a class name
        id = myId;
        name = myName;
        salary = Salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
public class Constructor {
    public static void main(String[] args) {
     MyEmployee lokesh = new MyEmployee(12, "Lokesh Jangale",50000);
        // MyEmployee lokesh = new MyEmployee(50000);
        System.out.println(lokesh.getId());
        System.out.println(lokesh.getName());
        System.out.println(lokesh.getSalary());
    }
}
