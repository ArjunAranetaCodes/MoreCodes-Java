
public class Problem10{
 public static void main(String[] args){
  int[] arrNumbers = {1, 2, 3};
  int sum = 0;
  int ave = 0;

  for(int x : arrNumbers){
   sum = sum + x;
  }

  ave = sum / 3;

  System.out.println("Average is " + String.valueOf(ave));
 }
}


