//Switch Case: Case is used when we have to make a choice between number of alternatives for given variable
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();


        //Break: it is used to break loop or switch case
        switch (age){
            case 18:
                System.out.println("You are ready for voter id!! ");
                break;

            case 21:
                System.out.println("You are ready to Married!!");
                break;

            case 60:
                System.out.println("You are ready to retired!!");
                break;
            default:
                System.out.println("Enjoy You life!!");
        }
        System.out.println("Thanks for using my Java codes!!");
    }
}
