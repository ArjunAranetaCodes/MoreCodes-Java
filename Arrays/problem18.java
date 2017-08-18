
import java.util.*;
public class Problem18{
 public static void main(String[]args){
  int[] array1 = {1,3,2,4};
  Arrays.sort(array1);

  int[] array2 = new int[array1.length];
  int y = array1.length - 1;
  for(int x = 0; x < array1.length; x++){
   array2[x] = array1[y];
   y--;
  }

  for(int x : array2){
   System.out.println(x);
  }
 }
}


