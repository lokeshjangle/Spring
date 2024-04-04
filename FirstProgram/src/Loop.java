//Loops: Loops make it easy for us to tell computer that a given set of instruction need to be executed rapeatedly
//Types of loop: While loop
//               Do while loop
//               for loop

import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //While loop
        int i = 1;
        System.out.println("While loop..");
        while(i<=3){
            System.out.println(i);
            i++;
        }

        //Do while loop: This loop is similar to a while loop except the fact that it is generated to execute at least once
        System.out.println("Do while loop....");
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }
        while (j<5);

        //For Loop
        System.out.println("Foor loop.........");
        int k = 1;
        for(k = 1; k<=20; k++){
            System.out.println(k);
        }

    }
}
