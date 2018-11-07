/*
Problem 8: Write a program to print the number pattern of ones and zeros using loop.
11111
11111
11011
11111
11111
*/
public class Problem{
 public static void main(String[] args){
  int row = 5;
  int col = 5;
  for(int y = 0; y < row; y++){
   for(int x = 0; x < col; x++){
    if(x == (row / 2) && y == (col / 2)){
     System.out.print("0");
    }else{
     System.out.print("1");
    }			
   }
   System.out.print("\n");
  }
 }
}