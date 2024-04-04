import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binary_num = sc.nextInt();
        int ans = 0; // for result converted decimal result
        int pw = 1; // pw = power of 2 which is 2^0

        while(binary_num > 0){
            int unit_digit = binary_num % 10;
            //System.out.println(unit_digit);
            ans += (unit_digit * pw);
            //System.out.println(ans);
            binary_num  /= 10;
            //System.out.println(binary_num);
            pw *= 2;
            //System.out.println(pw);
        }
        System.out.println("Decimal number is: " + ans);
    }
}
