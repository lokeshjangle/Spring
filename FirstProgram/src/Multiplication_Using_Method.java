import java.util.Scanner;

public class Multiplication_Using_Method{
    //Que.1:Create a method to print multiplication table
    static void mutiplication(int num) {
        int c;
        for (int i = 1; i <= 10; i++){
            System.out.format("%d * %d = %d\n",num,i,i*num);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        System.out.println("Multiplication of "+num+" is:");
        mutiplication(num);
    }
}
