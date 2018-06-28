//Problem 14: Write a program that recognizes valid hex color value using Regular Expression.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    String word1 = "192.168.1.1";
    String word2 = "1.1.1.1.1";
    String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    System.out.println(Pattern.matches(pattern, word1));
    System.out.println(Pattern.matches(pattern, word2));
  }
}