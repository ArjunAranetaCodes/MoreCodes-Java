//Problem 10: Write a program that converts a decimal number to octal number.
public class Problem10{
 public static void main(String[]args){
  int dec = 256;
  String oct = "";

  while (dec > 0){
   oct = String.valueOf(dec % 8) + oct;
   dec = dec / 8;
  }
  System.out.println(oct);
 }
}
