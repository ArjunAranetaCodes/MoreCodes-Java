//Problem 15: Write a program that takes a value inside a <div> tag using Regular Expression.
import java.util.regex.*;  
public class Problem{
  public static void main(String[]args){
    String word = "<div>Hello World</div>";
    String newWord = word.replaceAll("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>", "");
    System.out.println(newWord);
  }
}