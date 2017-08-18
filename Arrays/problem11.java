
public class Problem11{
 public static void main(String[] args){
  int[] arrNumbers = {1, 2, 3};
  int[] array2 = new int[3];

  int y = arrNumbers.length - 1;
  for(int x = 0; x < arrNumbers.length; x++){
   array2[x] = arrNumbers[y];
   y--;
  }

  for(int x : array2){
   System.out.println(x);
  }
 }
}


