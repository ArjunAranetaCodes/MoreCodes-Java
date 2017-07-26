//Problem 12: Calculate the Product of two numbers
//WITHOUT using the * operator.
public class Problem12{
 public static void main(String[]args){
   int num1 = 3;
   int num2 = 5;
   int prod = 0;

   for (int x = 1; x <= num2; x++){
    prod = prod + num1;
   }
   System.out.println("3 * 5 = " + String.valueOf(prod));
 }
}
