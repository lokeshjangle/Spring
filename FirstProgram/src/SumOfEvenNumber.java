import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        System.out.print("Even Numbers are: ");
        for (i=0;i<n;i++){
            System.out.print((2*i) + ", ");
            sum = sum + (2*i);
        }
        System.out.println("\nsum of even number: " +sum);
    }
}
