package Java_Code_Series;
import java.util.Scanner;
// file name is always the same as the public class name
public class TNSet02 {
    public static void main(String[] args) {

        // What is the result of the following expression?
        // float a=7/4*9/2;

        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);


        // wap to encrypt a grade by adding 8 to it and decrypt it by subtracting 8 from
        // it
        char grade = 'A';
        // encrypting data
        // grade += 8;
        // this is called type casting means converting one data type to another data
        // type
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);


        // use comparison operators to find out whether a given number is greater than user enered number or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(num>10);

        // write a following expression in a java program
        // v^2 - u^2 / 2as
        System.out.println("(v*v-u*u)/(2*a*s) ");
    }
}
