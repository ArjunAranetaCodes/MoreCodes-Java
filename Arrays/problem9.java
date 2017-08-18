
public class Problem9{
 public static void main(String[] args){
  int[] arrNumbers = {1, 2, 3};
  int sum = 0;

  for(int x : arrNumbers){
   sum = sum + x;
  }

  System.out.println("Sum is " + String.valueOf(sum));
 }
}


