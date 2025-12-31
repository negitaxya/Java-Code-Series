// this is java code for taking input from user
//  import java.io. ; is use for using input library in java 
// import java.util.*;
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

