//Problem 18: Write a program that extracts string inside quotation marks using Regular Expression.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    String word = "Hello 'World'";
    Pattern pattern = Pattern.compile( "\'([^\"]*)\'" );
    Matcher match = pattern.matcher(word);
    match.find();
    System.out.println(match.group(0));
  }
}