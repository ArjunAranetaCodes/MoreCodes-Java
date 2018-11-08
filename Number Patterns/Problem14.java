/*
Problem 14: Write a program to print the number pattern using loop.
1
22
333
4444
55555
*/
public class Problem{
 public static void main(String[] args){
		int row = 5;
		for(int y = 0; y <= row; y++){
			for(int x = 0; x < y; x++){
				System.out.print(y);
			}
			System.out.println();
		}
 }
}