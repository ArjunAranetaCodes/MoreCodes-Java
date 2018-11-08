/*
Problem 17: Write a program to print the number pattern using loop.
1
12
123
1234
12345
1234
123
12
1
*/
public class Problem{
 public static void main(String[] args){
		int row = 5;
		for(int y = 0; y <= row; y++){
			for(int x = 0; x < y; x++){
				System.out.print(x + 1);
			}
			System.out.print("\n");
		}
		
		for(int y = row - 1; y > 0; y--){
			for(int x = 0; x < y; x++){
				System.out.print(x + 1);
			}
			System.out.print("\n");
		}
 }
}