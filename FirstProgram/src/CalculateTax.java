//Question 3: Calculate income tax paid by an employee to government as per the slab mentioned below:
//        income slab         Tax
//        2.5L-5.0L           5%
//        5.0L-10.0L          20%
//        Above 10.0L         30%
//
//


import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

    }
}
