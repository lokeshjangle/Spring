/*Question 6: Write a program to find out the type of website from the URL
                       .com -> Commercial Website
                       .org -> organization website
                       .in  -> indian website
*/

import java.util.Scanner;

public class CheckWebsite {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
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

   }
}
