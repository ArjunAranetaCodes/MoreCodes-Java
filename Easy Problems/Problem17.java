//Problem 17: Write a program that outputs the index
//of the first occurrence of the letter in a string.
public class Problem17{
 public static void main(String[]args){
  String word = "program";
  String letter = "a";

  if(word.contains(letter)){
   System.out.println("Contains a");
  }else{
   System.out.println("Does no contain a");
  }
 }
}
