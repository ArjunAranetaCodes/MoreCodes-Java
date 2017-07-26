//Problem 6: Write a program that outputs all odd numbers
//below 20.
public class Problem6 {
 public static void main(String[] args) {
  for(int x = 0; x <= 20; x++){
   if(x % 2 == 1){
    System.out.println(x);
   }
  }
 }
}
