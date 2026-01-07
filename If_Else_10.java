import java.util.Scanner;

public class If_Else_10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        /*
         * checks condition if true or false
         * goes to if block if true ,if condition is false goes to else block
         */
        if (age < 18) {
            System.out.println("You are a Child");
        } else {
            System.out.println("you are an Adult");
        }

        int num=20;
        // == comparison operator
        boolean cond=(num==20);
        if (cond) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        // != not equal operator
        if(num!=12){
            System.out.println("Condition is true");
        }

    }
}