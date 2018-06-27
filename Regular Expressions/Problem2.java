//Problem 2: Write a program that matches email address.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    System.out.println(Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", "mark@yahoo.com"));
    System.out.println(Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", "mark-yahoo.com"));
  }
}