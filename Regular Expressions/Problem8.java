//Problem 8: Write a program that checks if the String if valid url using Regular Expression.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    String word = "http://www.example.com";
    String word2 = "wwwexamplecom";
    String pattern = "^(https?:\\/\\/)?(www\\.)?([\\w]+\\.)+[‌​\\w]{2,63}\\/?$";
    System.out.println(Pattern.matches(pattern, word));
    System.out.println(Pattern.matches(pattern, word2));
  }
}