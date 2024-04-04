/*
    Create a class Game, which allow a user to play "Guess the number "
    game ones. Game should have the following method:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses
    use properties with as noOfGuesses(int). etc. to get this task done!
 */

import java.util.Random;
import java.util.Scanner;

class Game{
    int num;
    int count=0;
    int guessNum;
    Scanner sc = new Scanner(System.in);
    Game(){
        //System.out.println("Enter the number: ");
        //num = sc.nextInt();
        Random rn = new Random();
        this.num = rn.nextInt(100);
       // System.out.println(num);
    }
    public void takeUserInput(){
        System.out.println("Guess the number:");
        guessNum = sc.nextInt();
    }
    void noOfGuesses(){
        this.count+=1;
    }
    public void isCorrectNumber(){
        while (true){
            takeUserInput();
            noOfGuesses();
            if(guessNum == num){
                System.out.println("Congratulation!! You guess right number...");
                System.out.println("The Number is: "+num);
                System.out.println("Total Number of guess is: "+count);
                break;
            }
            else if (guessNum<num) {
                System.out.println("OOPS!! You entered a small number.... Please enter a bigger number");
            }
            else {
                System.out.println("OOPS!! You entered a bigger number .....Please enter smaller number");
            }
        }
       }
}

public class GuessTheNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Game guess = new Game();
        guess.isCorrectNumber();
    }
}
