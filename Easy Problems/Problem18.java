//Problem 18: Write a program that outputs the frequency of a
//letter in a string.
public class Problem18{
 public static void main(String[]args){
  String word = "program";
  String letter = "a";
  int letterCount = 0;

  for(int x = 0; x < word.length(); x++){
   if(letter.contains(String.valueOf(word.charAt(x)))){
    letterCount += 1;
   }
  }

  System.out.println("Total: " + String.valueOf(letterCount));
 }
}
