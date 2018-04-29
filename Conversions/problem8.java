//Problem 8: Write a program that converts a decimal number to hexadecimal number.
public class Problem8{
 public static void main(String[]args){
  int dec = 256;
  String hex = "";

  while (dec > 0){
   hex = String.valueOf(dec % 16) + hex;
   dec = dec / 16;
  }
  System.out.println(hex);
 }
}
