import java.util.Scanner;

public class PracticeSet_2 {
    public static void main(String[] args){
        /*Question 1: What will be the result of the following expression
         float a = 7/4 * 9/2
         Byy the rule of Precedence and Associativity expression will execute left-to-right
         first it execute 7/4
            a = 1.75 * 9/2
         then it execute 1.75 * 9
            a = 15.75f/2.0f;
         then it execute 15.75f/2
            a = 7.875f
         */
        System.out.println("Question 1: What will be the result of the following expression\n" +
                "float a = 7/4 * 9/2");
        float a = 7/4.0f * 9/2.0f;
        System.out.println("a: "+a);

        /*Question 2: Write a java program to encrypt a grade by adding 8 to it, Decrypt it to show the correct grade
            //Note: Addition of Char + int = int
         */
        System.out.println("Question 2: Write a java program to encrypt a grade by adding 8 to it, Decrypt it to show the correct grade");
        char grade = 'B';
        //Incrypting the grade
        System.out.println("In Incrypt formate:");
        grade = (char)(grade + 8); //Note: Addition of Char + int = int
        System.out.println(grade);
        //Decrypting the Grade
        System.out.println("In Decrypt format:");
        grade = (char)(grade - 8);
        System.out.println(grade);

        /*Question 3:Use comparison operator to find out whether a given number is greater then the user entered number or not.

         */
        System.out.println("Question 3:Use comparison operator to find out whether a given number is greater then the user entered number or not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserInput: ");
        int UserInput = sc.nextInt();
        System.out.print("UserInput is greater:");
        System.out.println(UserInput>50);


        /* Question 4: Write the  following expression in a java program
            (v*v - u*u)/2bs
         */
        System.out.println("Question 4: Write the  following expression in a java program\n" +
                "(v*v - u*u)/2bs");
        int v = sc.nextInt();
        int u = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();
        float exp = ((v*v)-(u*u))/(2*b*s);
        System.out.println(exp);
    }
}
