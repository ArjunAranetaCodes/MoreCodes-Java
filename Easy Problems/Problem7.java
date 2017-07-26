//Problem 7: Write a program that finds the sum of all
//numbers from 1 to 20.
public class Problem7 {
 public static void main(String[] args) {
  int sum = 0;

  for(int x = 0; x <= 20; x++){
   sum = sum + x;
  }

  System.out.println("Sum of 1 to 20 " +
   String.valueOf(sum));
 }
}
