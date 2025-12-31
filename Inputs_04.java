// this is java code for taking input from user
/*java.util → this is a package (a folder of useful classes)
Scanner → a class inside that package
import → allows you to use that class in your program*/
// import java.util.*;
import java.util.Scanner;
package Java_Code_Series;

import java.util.Scanner;
// file name is always the same as the public class name
public class Inputs_04 {
    public static void main(String[] args) {
    try (// this help to take input from user 
            // system.in is use to take input from keyboard
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of integers: ");
// this is use to take integer input from user and also store it in N variable IT specitfies the type of input
            int N = sc.nextInt();
            System.out.println(N);
        }
    }
}


