package Java_Code_Series;

public class Operators_06 {
        public static void main(String[] args) {
       int  a=10;
       int b=14;
       System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
       // / os used for getting quotient
        System.out.println(a/b);
       // % is used for getting reminder
        System.out.println(a%b);

        b=6+ a;
        System.out.println(b);
        // a automatically prints the result by adding b in itself
        a+=b;
        System.out.println(a);
        // it checks the condition

        // == operator is used to compare
        System.out.println(5==a);
        a=a+b;
//        > operator is used for greater than sign
      System.out.println(a>b);

//        < operator is used for less than equal to sign
        System.out.println( a<=7 );
    }
}