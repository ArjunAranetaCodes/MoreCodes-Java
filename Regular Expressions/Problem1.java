//Problem 1: Write a program to test if the first character of the String is uppercase.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    System.out.println(Pattern.matches("^[A-Z][a-z0-9_-]{3,19}$", "Hello"));
    System.out.println(Pattern.matches("^[A-Z][a-z0-9_-]{3,19}$", "world"));
  }
}