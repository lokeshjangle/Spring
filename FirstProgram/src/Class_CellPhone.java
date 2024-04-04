//Ques: Create a class cellphone with method to print "ringing", "vibrating" etc
class cellphone{
    public void ringing(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating.........");
    }
}

public class Class_CellPhone {
    public static void main(String[] args) {
        cellphone phone = new cellphone();
        phone.ringing();
        phone.vibrate();
    }
}
