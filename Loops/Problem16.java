//Problem 16: Write a program that outputs the factorial
//of a number.
public class Problem16{
 public static void main(String[]args){
   int num = 5;
   int fact = 1;

   for (int x = num; x >= 1; x--){
    fact = fact * x;
   }
   System.out.print("Factorial of 5 is " + String.valueOf(fact));
 }
}
