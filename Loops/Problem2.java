//Problem 2: Write a program that accepts two numbers
//and perform all arithmetic operations.
import java.util.Random;
public class Problem2 {
 public static void main(String[] args) {
  Random rand = new Random();
  for(int x = 0; x < 5; x++){
   System.out.println(rand.nextInt(9));
  }
 }
}
