//Make inheritance of interface
//NOTE: You cannot inherit class using interface but you can implement a interface in class
//You can create inheritance of interface using extends keyword
interface sampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface{   //Interface ka inheritances
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_Interfaces {
    public static void main(String[] args){
        MySampleClass ms = new MySampleClass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
