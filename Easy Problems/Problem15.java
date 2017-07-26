//Problem 15: Write a program that finds if a string is
//within a string.
public class Problem15{
 public static void main(String[] args){
  String word1 = "programming";
  String word2 = "program";

  if (word1.indexOf(word2) != -1){
   System.out.print(word2 + " found");
  }else{
   System.out.print(word2 + " not found");
  }
 }
}
