 //Problem 8: Write a program that counts vowels in a string.
public class Problem8{
 public static void main(String[]args){
  String word = "program";
  String vowels = "aeiou";
  int vowelCount = 0;

  for(int x = 0; x < word.length(); x++){
   if(vowels.contains(String.valueOf(word.charAt(x)))){
    vowelCount += 1;
   }
  }

  System.out.println("Total: " + String.valueOf(vowelCount));
 }
}
