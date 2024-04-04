public class BreakContinue {
    public static void main(String[] args) {
        //Break and continue using loops
        //Break Statement
        int i = 0;
        for( i = 0; i<=10; i++){
            System.out.print(i);
            System.out.println(" Java is Great!!");
            if(i==5){
                System.out.println("Ending the loop!");
                break;
            }
        }
        System.out.println("Last value of loop is after break: " + i);

        //Continue Statement
        int j = 0;
        for (j = 0;j<=10;j++){
            System.out.print(j);
            System.out.println(" Python is great!!");
            if(j==5){
                System.out.println("Skip the iteration......" + j);
                continue;
            }
        }
        System.out.println("Last value after continue: " +j);
    }
}
