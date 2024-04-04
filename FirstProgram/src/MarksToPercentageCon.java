import java.util.Scanner;
public class MarksToPercentageCon {
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter overall marks of all subject: ");
        int total = marks.nextInt();
        System.out.println("Enter marks on subject 1:");
        int s1 = marks.nextInt();
        System.out.println("Enter marks on subject 2:");
        int s2 = marks.nextInt();
        System.out.println("Enter marks on subject 3:");
        int s3 = marks.nextInt();
        System.out.println("Enter marks on subject 4:");
        int s4 = marks.nextInt();
        System.out.println("Enter marks on subject 5:");
        int s5 = marks.nextInt();

        int totalMarks = s1 + s2 + s3 + s4 + s5;
        System.out.println("Total Marks are:\n" + totalMarks);
        float per = ((totalMarks)*100)/(total*5);
        System.out.println("Total Percentage of Student is:");
        System.out.println(per);
    }
}
