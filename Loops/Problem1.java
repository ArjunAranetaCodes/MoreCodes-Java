//Problem 1: Write a program that prints the numbers from 1 to 50.
//Output "Fizz" for multiples of 3, output "Buzz" for multiples of 5, and
//both "FizzBuzz" for multiples of both 3 and 5.
public class Problem1 {
 public static void main(String[] args) {
  for(int x = 0; x <= 50; x++){
   if((x % 3 == 0) && (x % 5 == 0)){
    System.out.println("FizzBuzz");
   }else if(x % 3 == 0){
    System.out.println("Fizz");
   }else if(x % 5 == 0){
    System.out.println("Buzz");
   }else{
    System.out.println(x);
   }
  }
 }
}
