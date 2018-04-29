//Problem 13: Write a program that converts celsius to farenheit.
public class Problem13{
 public static void main(String[]args){
  double celsius = 10.0;
  double farenheit = 0.0;
  farenheit = (9.0 / 5.0) * celsius + 32.0;
  System.out.println(String.valueOf(celsius) + "C equals to " +
   String.valueOf(farenheit) + "F");
 }
}
