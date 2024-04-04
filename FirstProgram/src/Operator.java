import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        float a = sc.nextInt();
        System.out.print("Enter b:");
        float b = sc.nextInt();
        System.out.println("-----------Arithmatic Operator------------------");
        //Addition
        float add = a + b;
        System.out.println("Addition is: "+ add);
        float sub = b - a;
        System.out.println("Substration is: " + sub);
        float mul = a * b;
        System.out.println("Multiplication is: " + mul);
        float div = b / a;
        System.out.println("Division is: " + div);
        float mod = b % a;
        System.out.println("Modulo is: " + mod);

        //Note:Arithmatic operators cannot work with boolean
        //Comparison Operator: (==, >, <, >=, <=)
        //Logical Operator: (??, ||, !)
        //Bitwise operator : it operate bit by bit
    }
}

