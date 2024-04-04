import java.util.Scanner;

public class PosiiveNegative_method {
    static void checkpositve(int a){
        if(a>=0){
            System.out.println("Num is Positive....");
        }
        else{
            System.out.println("Num is Negative....");
        }
            }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        checkpositve(num);

    }
}
