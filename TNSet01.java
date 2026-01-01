package Java_Code_Series;

import java.util.Scanner;
public class TNSet01 {
    static void main(String[] args) {

//       Question 1 - wap sum of 3 no.s
        short a = 2;
        short b = 4;
        short c = 87;
        int sum = a + b + c;
        System.out.println("Sum of 3 no.s is: " + sum);

//Question 2 - Wap to Calculate cgpa using marks of three subjects (out of 100)
        float sub1 = 35;
        float sub2 = 35;
        float sub3 = 97;
        float total = sub1 + sub2 + sub3;
        float cgpa = total / 30;
        System.out.println("Total cgpa: " + cgpa);


//Question 3 - Wap to ask a name to the user and then print "hey (name) have a good day"
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hey " + name + " have a good day");

//       Question 4 - Wap to convert from kilometers to miles
        System.out.println("Enter kilometers: ");
        Scanner k = new Scanner(System.in);
        float km = k.nextFloat();
    System.out.println(" ");
        System.out.println("1km = 0.62 miles");
        System.out.print("Convert km to miles:");
        float miles = km*0.62f;
        System.out.println(+km+" = "+miles+"miles");

//        Question - 5 Wap to select whether a number entered by a user is integer or not
        System.out.println("Enter a variable");
        Scanner var = new Scanner(System.in);
        System.out.println("Is this integer?");
        System.out.println(var.hasNextInt());
    }
}


