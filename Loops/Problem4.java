//Problem 4: Write a program that outputs an asterisk
//pyramid.
public class Problem4{
 public static void main(String[]args){
   for (int y = 0; y <= 5; y++){
    for (int x = 0; x <= y; x++){
     System.out.print("*");
    }
    System.out.println();
   }
 }
}
