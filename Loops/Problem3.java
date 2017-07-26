//Problem 3: Write a program that accepts length and
//width of rectangle to find area.
public class Problem3{
 public static void main(String[]args){
  String word = "MoreCodes";
  int wordCount = 0;

  for (char ch: word.toCharArray()) {
   wordCount++;
  }

  System.out.print("String Length: " + String.valueOf(wordCount));
 }
}
