//Problem 9: Write a program to display the multiplication
//table of a given integer.
public class Problem9{
 public static void main(String[]args){
   int num = 2;
   for (int x = 0; x <= 10; x++){
    System.out.println(String.valueOf(num) + " x " +
     String.valueOf(x) + " = " + String.valueOf(num * x));
   }
 }
}
