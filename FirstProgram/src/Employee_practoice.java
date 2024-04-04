//Ques: Create a class Employee with following propertice and method
// Salary(property)(int)
//getSalary(method returning int)
//name (property)(String)
//getName(method returning string)
//setName(method changing name)


class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
}
public class Employee_practoice {
    public static void main(String[] args) {
        Employee1 lokesh = new Employee1();
        lokesh.setName("Lokesh Jangale");
        System.out.println(lokesh.getName());
        lokesh.salary = 25000;
        System.out.println(lokesh.getSalary());

    }
}
