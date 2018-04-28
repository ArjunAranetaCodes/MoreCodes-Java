//Problem 4: Write a program that converts a string to array/list.
public class Problem4{
 public static void main(String[]args){
  String numbers = "1,2,3";
  String[] arrNumbers = numbers.split(",");
  for(String x : arrNumbers){
   System.out.println(x);
  }
 }
}
