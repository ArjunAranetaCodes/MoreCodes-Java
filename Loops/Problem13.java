 //Problem 13: Write a program that reverses a string.
public class Problem13{
 public static void main(String[]args){
   String word = "MoreCodes";
   String newWord = "";

   for (int x = word.length() - 1; x >= 0; x--){
    newWord = newWord + word.charAt(x);
   }
   System.out.println(newWord);
 }
}
