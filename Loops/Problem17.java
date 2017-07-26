//Problem 17: Write a program that outputs the
//fibonacci sequence of a number.
public class Problem17{
 public static void main(String[]args){
   int num1 = 1;
   int num2 = 1;

   System.out.println(num1);
   while (num2 < 100){
    System.out.println(num2);
    num2 = num2 + num1;
    num1 = num2 - num1;
   }
 }
}
