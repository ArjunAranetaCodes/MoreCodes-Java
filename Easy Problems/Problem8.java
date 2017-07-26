//Problem 8: Write a program that outputs all numbers divisible by
//5 from 1 to 30.
public class Problem8 {
 public static void main(String[] args) {
  int sum = 0;

  for(int x = 0; x <= 30; x++){
   if(x % 5 == 0){
    sum = sum + x;
   }
  }

  System.out.println("Sum of numbers divisible by 5 from 1 to 30 is " +
   String.valueOf(sum));
 }
}
