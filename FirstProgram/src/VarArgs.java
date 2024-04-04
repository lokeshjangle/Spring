//VarArgs method is allow passing multiple argument in method

public class VarArgs {
//    static int  sum(int a, int b){
//        return a+b;
//    }
//    //using this sum method we only pass two argument but if we want to pass more argument in sum it need to create another sum method or function
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c,int d){
//        return a+b+c+d;
//   }
//     It is required create multiple sum method if arguments are increase it requried make changes in method or create new method b
    //But if we use VarArgs technique it not required to create new fuction again and again or need to make changes
    //-------------Using VarArgs Technique----------
    static int sum(int... arr){  //Passing arguments as array then it is no limit it is increase dynamically
        //Available as int [] arr;
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    //Basically it is create array of argument which we will pass hence no need to create sum method for again and again
    public static void main(String[] args){
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 3,4 and 5 is: "+sum(3,4,5));
        System.out.println("The sum of 2,3,4 and 5 is: "+sum(2,3,4,5));




    }
}
