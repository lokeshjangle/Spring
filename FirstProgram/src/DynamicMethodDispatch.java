//Dynamic Method Dispatch
//Means when you call the object you can give the refrence as a parent class to sub class
class Phone{
    public void greet(){
        System.out.println("Good Morning!!");
    }
    public void On(){
        System.out.println("The phone is turning on...");
    }
}
class SmartPhone extends Phone{
    public void On(){
        System.out.println("The SmarthPhone is turning on......");
    }
    public void musin(){
        System.out.println("MUsing is playing ...........");
    }

}

public class DynamicMethodDispatch{
    public static void main(String[] args) {
        //Syntax of Dynamic Method Dispatch is:
        //superClass obj = new subClass
        Phone obj = new SmartPhone(); //Dynamic method dispatch //syntax is allowed'
        //SmartPhone obj1 = new Phone(); //Syntax is not allowed
        obj.greet();
        //When you call override function, the object class or subclass ka override function call krega pehle
        obj.On();
        //obj.music();//the method not call in Dynamic Method Dispatch who present in Sub class
    }
        }
