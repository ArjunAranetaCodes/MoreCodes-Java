
public class Problem6{
 public static void main(String[]args){
  int[] arrNumbers = {1,2,3};
  int count = 0;

  for(int x : arrNumbers){
   if(x == 2){
    count = count + 1;
   }
  }

  if(count > 0){
   System.out.println("Contains 2");
  }else{
   System.out.println("Does not contain 2");
  }
 }
}


