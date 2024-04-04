//Method: Method is similar like function it is use for avoid repetation of code and reduce the size of code
//Calling Method: A method can be called by creating an object of the class in which the method exist followed by the method call
//We can create method using static function mainly
//Syntax: static datatype method_name(){
//              method data }
//We can also create method without using static function which is called method invocation using object creation
//Syntax: class_name obj = new class_name();
//          c = obj.logic(5,7);
public class method {
    //if you want to return integer in method so we use int type and if we want to not return anything in method so we use void datatypes
    static int logic(int x, int y){    //creatng method
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a;
        int b;
        int c;
        //Method invocation using Object creation
//        method obj = new method();
//        c = obj.logic(5,7); //Method calling withous using static funtion
        c = logic(5,7);
        System.out.println(c);
        c = logic(12,5);
        System.out.println(c);
    }
}
