//Problem 9: Write a program that converys a hexadecimal number to decimal number.
public class Problem9{
 public static void main(String[]args){
  int dec = 0;
  String hex = "100";

  String reverse = new StringBuffer(hex).reverse().toString();

  for (int x = 0; x < reverse.length(); x++){
   dec = dec + (Integer.valueOf(String.valueOf(reverse.charAt(x))) *
    (int)Math.pow(16, x));
  }

  System.out.println(dec);
 }
}
