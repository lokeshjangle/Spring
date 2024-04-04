import java.util.Scanner;

//Recursion: A function in java which call itself. Such calling of function is called recursion
public class Recursion {
    //find factorial using recursion
    static int factorial_recursion(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial_recursion(n - 1);
        }
    }

    //Factorial without using Recursion
    static int factorial_iterative(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial *=  i;
        }
        return  factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("-----------Factorial using recursion---------------");
        System.out.println("Factorial of "+n+" is: "+factorial_recursion(n));
        System.out.println("-----------Factorial using iterative/Direct---------------");
        System.out.println("Factorial of "+n+" is: "+factorial_iterative(n));


    }
}
