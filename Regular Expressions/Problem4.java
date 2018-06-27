//Problem 4: Write a program that matches time in 12 hour format.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    System.out.println(Pattern.matches("(((0[1-9])|(1[0-2])):([0-5])([0-9])\\s(a|p)m)", "08:01 am"));
    System.out.println(Pattern.matches("(((0[1-9])|(1[0-2])):([0-5])([0-9])\\s(a|p)m)", "18:01 pm"));
  }
}