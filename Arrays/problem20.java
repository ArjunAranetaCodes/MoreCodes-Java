
import java.util.*;
public class Problem20{
 public static void main(String[] args){
  int[] arrNumbers = {4, 3, 2, 1};
  int closest = 0;
  int numDiff = arrNumbers[0];

  for(int x : arrNumbers){
   int diff = 0 - x;
   diff = Math.abs(diff);
   if(diff < numDiff){
    numDiff = diff;
    closest = x;
   }
  }

  System.out.println("Closest to 0 is " +
   String.valueOf(closest));
 }
}


