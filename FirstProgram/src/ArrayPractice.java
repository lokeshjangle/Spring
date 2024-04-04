import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 85;
        marks[2] = 79;
        marks[3] = 89;
        marks[4] = 96;
        System.out.println(marks[3]);

    }
    //There are three ways to create array in java
    //1.Declaration and memory allocation and then initialization
    //   int [] marks = new int[5];
    //2. Declaration and then memory allocation and then initialization
    //    int [] marks; ....Declaration
    //    marks= new int[5];.....memory allocation
    //3.Declaration and memory allocation and  initialization together
    //    int [] marks = {100, 70, 80,}
}
