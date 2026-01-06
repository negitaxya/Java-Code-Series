package Java_Code_Series;

import java.util.Scanner;
public class Strings_08 {
    public static void main(String[] args) {
        
//        this is string class
        String name = new String("Taniya negi");
        System.out.println(name);

        System.out.print("My name is " );
        System.out.println(name);

//        printf is same in c,c++,java to use formate specifier
        int a=43;
        float b=2.337f;
        System.out.printf("the value of a=%d and b=%f",a,b);
        System.out.format("the value of a=%d and b=%f",a,b);

//        this is used for writing in console then print the string
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter anything in console ");
        String str=sc.nextLine();
        System.out.println(str);
    }
}
