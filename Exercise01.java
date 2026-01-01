package Java_Code_Series;
//Wap to get total marks and percentage of students

//import scnanner/input library
import java.util.Scanner;
//class declaration
public class Exercise01 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
//input the details 
                System.out.println("Enter your name:");
                String name = sc.nextLine();

                System.out.println("Enter your marks of subject 1:");
                int subject1 = sc.nextInt();

                System.out.println("Enter your marks of subject 2:");
                int subject2 = sc.nextInt();

                System.out.println("Enter your marks of subject 3:");
                int subject3 = sc.nextInt();

                System.out.println("Enter your marks of subject 4:");
                int subject4 = sc.nextInt();

                System.out.println("Enter your marks of subject 5:");
                int subject5 = sc.nextInt();
//calculate total marks and percentage
                int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
                double percentage = (totalMarks * 100.0) / 500;
//print the result
                System.out.println("\n--- Result of XYZ School ---");
                System.out.println("Name of student: " + name);
                System.out.println("Your Total Marks: " + totalMarks);
                System.out.println("Your Percentage: " + percentage + "%");

                sc.close();
        }
}

