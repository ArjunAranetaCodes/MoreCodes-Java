//Loop Structures
public class Loops{
 public static void main(String[] args){
  System.out.println("For Loop");
  int x = 0;
  for(x = 0; x<=10; x++){
   System.out.print(x);
  }

  System.out.println();
  System.out.println();
  System.out.println("While Loop");
  x = 0;
  while(x<=10){
   System.out.print(x);
   x++;
  }

  System.out.println();
  System.out.println();
  System.out.println("Do Loop");
  x = 0;
  do{
   System.out.print(x);
   x++;
  }while(x<=10);
 }
}
