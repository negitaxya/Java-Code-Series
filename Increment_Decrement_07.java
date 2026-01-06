public class Increment_Decrement_07 {
    public static void main(String[] args) {
        int a=10;
//      a++ is used to use the original value first then increment
        System.out.println(a++);
        System.out.println(a);
int b= 66;

//      ++a is used to increment first then use
System.out.println(++b);
        System.out.println(b);

        int d=2;
//      aacording to associavity  this operation firstly increase the value first then add with 5
        System.out.println(++d+5);

        //this operator also increase the characters
        char ch='a';
        char c='A';
        System.out.println(ch++);
        System.out.println(ch); 
        System.out.println(c++);
        System.out.println(c);
        char ch1='z';
        System.out.println(++ch1);
    }
}