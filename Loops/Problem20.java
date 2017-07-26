//Problem 20: (RecursioN) Write a program that outputs the
//sum of numbers from 1 to n.
public class Problem20{
 public static void main(String[] args){
  System.out.println("Sum is " + GetSum(10, 0));
 }

 static int GetSum(int num, int sum){
  if (num == 0){
   return sum;
  }else{
   return GetSum((num - 1), (sum + num));
  }
 }
}
