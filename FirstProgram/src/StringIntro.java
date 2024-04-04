import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args){
        /*String:
            -String is a sequence of character
            -In java String is a class like Scanner, but it is also use like data type
            -String is a instantiated as follows
            -String is immutable it cannot be changed
            -Space also count in string
         */


        //Use string like class
        String name = new String("Lokesh");
        System.out.println(name);

        //Also use string like data types
        String Name = "Lokesh Jangale";
        System.out.println(Name);


        //In java you can also use 'printf' option for print as a replacement of 'println' like c-language
        int a = 12;
        float b = 6.024f;
        System.out.printf("The value of a is %d and value of b is %f",a,b); //%d is also known as format specifier
        //Note: Printf is mostly use in by c-programmer
        System.out.println();

        //Get user input for string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
//        String st = sc.next();
        String st = sc.nextLine();
        System.out.println("My name is: " + st);
        //Note: For printing one word in string use sc.next()
        //      -For printing Whole string use sc.nextLine()
    }
}
