//Problem 14: Write a program that accepts 5 numbers
//and outputs the average.
import java.util.Scanner;
public class Problem14{
 public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   int num = 0;
   int sum = 0;
   int ave = 0;

   for (int x = 0; x < 5; x++){
    System.out.print("Enter a number: ");
    num = scan.nextInt();
    sum = sum + num;
   }
   ave = sum / 5;
   System.out.println("Average is " + String.valueOf(ave));
 }
}
