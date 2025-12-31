package Java_Code_Series;

/*java.util → this is a package (a folder of useful classes)
Scanner → a class inside that package
import → allows you to use that class in your program*/
import java.util.Scanner;
public class Types_of_Inputs_05 {
    
    public static void main(String[] args) {
        // Taking integer input
        // 👉 Create a Scanner object named sc that reads input from the keyboard
                Scanner sc = new Scanner(System.in);
            // Taking integer input
            System.out.print("Enter an integer: ");
            int intValue = sc.nextInt();
            System.out.println("You entered integer: " + intValue);
            // Taking double input
            System.out.print("Enter a double: ");
            double doubleValue = sc.nextDouble();
            System.out.println("You entered double: " + doubleValue);
            // Taking string input
            System.out.print("Enter a string: ");
            sc.nextLine(); // Consume the newline character
            String stringValue = sc.nextLine();
            System.out.println("You entered string: " + stringValue);
            // to check boolean input
            System.out.println("Enter a boolean value (true/false): ");
            boolean a = sc.hasNextInt();
            System.out.println(a);


            // Close the scanner
            sc.close();

    }
}
