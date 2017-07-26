'If, ElseIf, and Else Structure
public class if_else{
 public static void main(String[]args){
  int num1 = 1,
  num2 = 2;

  //if statement
  if(num1>num2){
   System.out.println("First number is higher!");
  }

  //if-else statement
  if(num1==num2){
   System.out.println("They are equal!");
  }else{
   System.out.println("They are not equal!");
  }

  //if-else if statement
  if(num1>num2){
   System.out.println("First number is greater!");
  }else if(num1<num2){
   System.out.println("Second number is greater!");
  }
 }
}
