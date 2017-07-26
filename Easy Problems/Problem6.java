//Problem 6: Write a program that checks a number
//input is even or odd.
import java.util.Scanner;
public class Problem6 {
 public static void main(String[] args) {
  int num = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of num: ");
  num = sc.nextInt();

  if(num % 2 == 0){
   System.out.println("Number is even");
  }else{
   System.out.println("Number is odd");
  }
 }
}
