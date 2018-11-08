/*
Problem 16: Write a program to print the number pattern using loop.
12345
1234
123
12
1
*/
public class Problem{
 public static void main(String[] args){
		int row = 5;
		for(int y = row; y > 0; y--){
			for(int x = 0; x < y; x++){
				System.out.print(x + 1);
			}
			System.out.print("\n");
		}
 }
}