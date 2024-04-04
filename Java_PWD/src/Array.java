import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 50;
        marks[1] = 70;
        marks[2] = 80;
        for( int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.println("Enter the element of array");
        for (int i = 0; i < size; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Output is:");
        for (int i = 0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
