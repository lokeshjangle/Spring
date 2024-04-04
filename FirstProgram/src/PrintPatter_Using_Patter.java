import java.util.Scanner;

public class PrintPatter_Using_Patter {
    static void PrintPattern(int num){
        for(int i=0; i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        PrintPattern(num);

    }
}
