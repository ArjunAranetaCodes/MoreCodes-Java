//Problem 20: Write a program that converts a number to its 
//corresponding month (e.g. 1 = January).
public class Problem20{
 public static void main(String[]args){
  int index = 1;
  String[] month = {"January", "February", "March", "April",
   "May", "June", "July", "August",
   "September", "October", "November", "December"};

  System.out.println(month[index - 1]);
 }
}
