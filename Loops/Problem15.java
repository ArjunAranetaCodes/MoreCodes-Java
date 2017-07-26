//Problem 15: Write a program that will ask the user to
//input n positive numbers. The program will terminate
//if one of those number is not positive.
import java.util.Scanner;
public class Problem15{
 public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   int num = 0;
   while (num > -1){
    System.out.print("Enter a number: ");
    num = scan.nextInt();
   }
   System.out.print("Terminated");
 }
}
