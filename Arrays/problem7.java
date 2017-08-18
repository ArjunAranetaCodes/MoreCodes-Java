
public class Problem7{
 public static void main(String[] args){
  int[] arrNumbers = {1, 2, 3};
  int max = 0;

  for(int x : arrNumbers){
   if(x > max){
    max = x;
   }
  }

  System.out.println("Largest number: " +
   String.valueOf(max));
 }
}


