public class Method_Overloading {
    static void changeInt(int a){
        a=80;
    }
    static void changeArray(int [] arr){
        arr[0] = 80;
    }
    public static void main(String[] args) {
        //NOTE: If we pass integer in method it is not pass complete integer it is send copy of integer
        //      if any changes occurs in method this change are not reflect in main function integer
        int a = 45;
        changeInt(a);
        System.out.println("The value of a after running changeInt method is : "+ a); //Changes will not reflect in main function

        //NOTE: If we pass an array to method and occur change in array in method this change is reflect in main fuction
        int [] marks = {54,78,87,95,97,80};
        changeArray(marks);
        System.out.println("The value of array after running changeArray method is: "+marks[0]);//Changes from methood will reflect
    }
}
