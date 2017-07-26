//Problem 18: (Recursion) Write a program that outputs the
//fibonacci sequence of a number.
public class Problem18{
 public static void main(String[] args){
  for (int x = 0; x <= 11; x++){
   System.out.println(Fibonacci(x));
  }
 }

 static int Fibonacci(int num){
  if ((num == 1) || (num == 0)){
   return num;
  }else{
   return Fibonacci(num - 1) + Fibonacci(num - 2);
  }
 }
}
