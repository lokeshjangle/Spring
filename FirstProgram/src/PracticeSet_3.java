import java.util.Scanner;
public class PracticeSet_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Question 1: What is the output of the given program
//        int a = 10;
//        if (a = 11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }
        //Output: It shows error


        //Question 2: Write a program to find out whether a student is pass or fail. If it requires total 40% and at least 33% in each subject to pass.
        //            Assume 3 subject and take marks as an input from user


       /* byte m1, m2, m3;
        System.out.println("Enter your marks in Physics:");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry:");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Mathematics:");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Average is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation!! You are been promoted");
        }
        else{
            System.out.println("Sorry, You have been not been promoted \nTry again later");
        }*/



        /*Question 3: Calculate income tax paid by an employee to government as per the slab mentioned below:
                        income slab         Tax
                        2.5L-5.0L           5%
                        5.0L-10.0L          20%
                        Above 10.0L         30%


        System.out.println("Enter your income in lakhs: ");
        float income = sc.nextFloat();
        float tax = 0;

        if (income <= 2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5 && income<=10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10);
        }
        System.out.println("The total tax paid by the employee is: " + tax * 100000);

         */


        /*Question 4: Write a java program to find out the day of the week given the number [ 1 for monday, 2 for tuesday ... so on]
        System.out.println("Enter day no. between 1 to 7:");
        int day = sc.nextInt();

        if (day>7){
            System.out.println("This is Wrong entry \nPlease enter between 1 to 7:");
        }
        else{
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;*/

        //Question 5: Write a java program to find whether a year entered by the user is a leap year or not

        /*Question 6: Write a program to find out the type of website from the URL
                        .com -> Commercial Website
                        .org -> organization website
                        .in  -> indian website


        System.out.println("Enter your website: ");
        String wb = sc.nextLine();
        if (wb.endsWith(".com")){
            System.out.println("This website are commercial website");
        }
        else if(wb.endsWith(".org")){
            System.out.println("This website are organization website");
        }
        else if(wb.endsWith(".in")){
            System.out.println("This website are Indian website");
        }

         */
    }
}
