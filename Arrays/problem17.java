
import java.util.*;
public class Problem17{
 public static void main(String[]args){
  int[] array1 = {1,2,3};

  int[] newArray = new int[array1.length + 1];
  for(int x = 0; x < array1.length; x++){
   newArray[x] = array1[x];
  }
  newArray[newArray.length - 1] = 10;

  for(int x : newArray){
   System.out.println(x);
  }
 }
}


