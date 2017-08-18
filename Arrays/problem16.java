
import java.util.*;
public class Problem16{
 public static void main(String[]args){
  int[] arrNumbers = {1,2,3,4};
  int n = 2;
  int tempNum = 0;
  int indexOfNum = 0;

  for(int x = 0; x < arrNumbers.length - 1; x++){
   if(arrNumbers[x] == 2){
    indexOfNum = x;
   }
  }

  for(int x = 0; x < arrNumbers.length - 1; x++){
   if ((x >= indexOfNum) && (x < arrNumbers.length - 1)){
    arrNumbers[x] = arrNumbers[x + 1];
   }
  }

  arrNumbers[arrNumbers.length - 1] = 0;

  int[] newArray = Arrays.copyOf(arrNumbers,3);

  for(int x : newArray){
   System.out.println(x);
  }
 }
}


