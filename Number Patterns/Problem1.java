/*
Problem 1: Write a program to print the number pattern of ones and zeros using loop.
11111
11111
11111
11111
11111
*/
public class Problem{
 public static void main(String[] args){
  for(int y = 0; y < 5; y++){
   for(int x = 0; x < 5; x++){
    System.out.print("1");
   }
   System.out.println();
  }
 }
}