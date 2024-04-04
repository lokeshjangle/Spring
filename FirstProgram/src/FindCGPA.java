import java.util.Scanner;
public class FindCGPA {
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String Name = name.next();
        System.out.println("Enter Marks");
        System.out.println("Enter subject 1:");
        float s1 = marks.nextFloat();
        System.out.println("Enter subject 2:");
        float s2 = marks.nextFloat();
        System.out.println("Enter subject 3:");
        float s3 = marks.nextFloat();
        float total = s1 + s2 + s3;
        float cgpa = total/30;
        System.out.println("Hello " + Name + "\n Your CGPA is : "+ cgpa);

        //Note: Agar hamara answer float me ana h to input bhi float me lo bcoz agar input integer me liya to ans integer me hi ayega


    }
}
