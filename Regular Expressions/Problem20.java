//Problem 20: Write a program that validates if string length is between 5 to 10 using Regular Expression.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    System.out.println(Pattern.matches("\\w{5,10}\\b", "Hello"));
    System.out.println(Pattern.matches("\\w{5,10}\\b", "Hi"));
  }
}