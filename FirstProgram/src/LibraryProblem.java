//You have to implement a library using Java Class Library
//Methods:addBook, issueBook, returnBook, showAvailableBooks
//Properties: Array to store the available books
//Array to store issued Books

import javax.xml.stream.events.EndElement;
import java.util.Scanner;

class Library{
    public  String[] Books = new String[100];
    public int count=0;
    public int n;
    Scanner sc = new Scanner(System.in);
    Library(){
        while (true) {
            System.out.println("-----------Welcome to library------------");
            System.out.println("1.Add Book");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Availability of Books");
            System.out.println("5.Exit");
            System.out.println("Enter the choice:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issuedBooks();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    AvailableBooks();
                    break;
                default:
                    System.out.println("Invalid Input....");
                    break;

            }
            if(num==5){
                break;
            }
        }
    }
    public void addBook(){
        System.out.println("Enter how many book you add: ");
        this.n = sc.nextInt();
        for (int i=0;i<=n;i++ ){

            System.out.println("Enter " + i + " name of book");
            this.Books[i] = sc.nextLine();

        }
        System.out.println("Book has been added..");

    }
    public void issuedBooks(){
        System.out.println("Enter name of books you want...");
        String issuedBooks = sc.nextLine();
        for (int i=1; i<=this.n;i++){
            if (issuedBooks.equalsIgnoreCase(Books[i])){
                this.Books[i]=null;
            }

        }
        System.out.println("This Book Are not Available");
    }
    public void returnBook(){
        System.out.println("How many book you want to return ");
        int num = sc.nextInt();
        for (int i=0;i<=num;i++){
            System.out.println("Enter Book name you want to return:");
            String rBook = sc.nextLine();
            this.Books[i] = rBook;
        }

    }

    public void AvailableBooks(){
        int n=100;
        System.out.println("The Available books are:");
        for (int i=1;i<=this.n;i++ ){
            if(Books[i]==null){
                continue;

            }
            System.out.println(i + " " + this.Books[i]);

        }
    }
}

public class LibraryProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

    }
}
