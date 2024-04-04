public class OperatorPrecidence {
    public static void main(String[] args) {
        // Precedence and Associativity
        //Note: Precedence of both operator are same so evaluation depend on associativity
        int a = 6*5-34/2;
        /*
        highest precedence goes to * and /. They are tha  evaluate on the basis of  left to right associativity.
        //Note: * and / precedence is higher then + and -. So in equation * and / are firstly evaluate and then + and - .
        //and associativity works left-to-right.
           =30-34/2
           =30-17
           =13
        */
        System.out.println(a);
        int b = 60/5-34*2;
        /*
          =12-34*2
          =12-68
          =-56
         */
        System.out.println(b);
    }
}
