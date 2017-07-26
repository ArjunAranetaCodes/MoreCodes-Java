//Problem 20: Write a program that checks if a string is a
//palindrome.
public class Problem20{
 public static void main(String[]args){
  String word = "anna";
  String tempWord = new StringBuffer(word).reverse().toString();

  if(word.equals(tempWord)){
   System.out.println("Palindrome");
  }else{
   System.out.println("Not Palindrome");
  }
 }
}
