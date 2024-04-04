import java.util.*;
public class RockPaperSeasor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name:");
        String name = sc.nextLine();
        System.out.println("0 for Rock \n1 for Paper \n2 for Scissor");
        System.out.println("Enter your choice:");
        int userinput = sc.nextInt();

        Random rn = new Random();
        int computerinput = rn.nextInt(3);
        System.out.println("Computer Choice: " + computerinput);
        if (userinput==computerinput){
            System.out.println("Game are Tie.......");
        }
        else if(userinput==0 && computerinput == 2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1 ){
            System.out.println(name + " Congratulation!! You won.......");
        }
        else {
            System.out.println("Computer won.....\nBetter luck next time.....");
        }


    }
}