//Problem 7: Write a program that outputs the sum of
//numbers from 1 to n.
public class Problem7{
 public static void main(String[]args){
   int n = 10;
   int sum = 0;
   for (int x = 0; x <= n; x++){
    sum = sum + x;
   }
   System.out.println("Sum is " + String.valueOf(sum));
 }
}
