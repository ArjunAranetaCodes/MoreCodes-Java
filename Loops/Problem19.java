//Problem 19: (Recursion) Write a program that outputs
//all even numbers below 20.
public class Problem19{
 public static void main(String[] args){
  PrintEven(10);
 }

 static int PrintEven(int num){
  if (num == 0){
   return num;
  }else{
   if (num % 2 == 0){
    System.out.println(num);
   }
   return PrintEven(num - 1);
  }
 }
}
