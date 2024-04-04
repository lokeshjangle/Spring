//Reading data from keyboard: In order to read data from the keyboard, Java has a Scanner class
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking Input From user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        //for integer
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        //for float
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of these numbers is:");
        System.out.println(sum);

//        System.out.println("Enter input to check it is a integer on not?");
//        boolean b1 = sc.hasNextInt();   //.hasNextInt() is used to check next input are integer or not
//        System.out.println(b1);

        //for String
        System.out.println("Enter your name:");
        //String str = sc.next();
        // .next() only read single word so for string we use .nextLine()
        String str = sc.nextLine();
        System.out.println(str);
    }
}
