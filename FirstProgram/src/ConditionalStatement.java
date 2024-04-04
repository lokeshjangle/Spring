//Conditional Statement: Program get decision using conditional statement
import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        //Note: '=' use to assign value and '==' is used to check value equal to or not equal to


        //if-else statement
        if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive yet!!");
        }
    }
}
