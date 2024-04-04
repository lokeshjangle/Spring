/*Write a program to print the following pattern
* * * * *
* * * *
* * *
* *
*
 */
import java.util.*;

public class PatternQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iteration: ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }
}
