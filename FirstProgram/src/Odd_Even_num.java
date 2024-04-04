import java.util.Scanner;

public class Odd_Even_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Even Numbers = 2i = 0,2,4,6,8
        //Odd Numbers = 2i=+1 = 1,3,5,7,9
        System.out.println("Enter n number:");
        int n = sc.nextInt();
        System.out.println("Even Number........");
        for (int i=0; i<=n; i++){
            System.out.println(2*i);
        }

        System.out.println("Odd Number.........");
        for(int j=0; j<=n; j++){
            System.out.println(2*j+1);
        }

    }
}
