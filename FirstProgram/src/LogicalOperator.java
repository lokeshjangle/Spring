public class LogicalOperator {
    public static void main(String[] args) {
        /*Logical Operator: && -> AND
                            || -> OR
                            !  -> NOT
         */
        System.out.println("For Logical AND.........");
        boolean a = true;
        boolean b = false;

        if (a && b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("For Logical OR.........");
        if (a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("For Logical NOT.........");
        System.out.println("Not(a) is " + !a);
        System.out.println("Not(b) is " + !b);
    }
}
