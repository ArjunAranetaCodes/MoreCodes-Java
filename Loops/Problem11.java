//Problem 11: Write a program that checks if a number
//is palindrome.
public class Problem11{
 public static void main(String[]args){
   int num = 3333;
   int sum = 0;
   int temp = 0;
   int rmdr = 0;

   temp = num;

   while (temp != 0){
    rmdr = temp % 10;
    sum = sum * 10 + rmdr;
    temp = temp / 10;
   }

   if (num == sum){
    System.out.println("Palindrome number");
   }else {
    System.out.println("Not an Palindrome number");
   }
 }
}
