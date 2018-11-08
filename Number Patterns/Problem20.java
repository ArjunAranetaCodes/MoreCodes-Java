/*
Problem 20: Write a program to print the number pattern using loop.
  1
 222
33333
 444
  5
*/
public class Problem{
 public static void main(String[] args){
		int y = 0;
		int x = 0;
		int rows = 3;
		int stars = 1; 
		int blank = rows - 1;

		for(y=1; y<rows*2; y++){
			for(x=1; x<=blank; x++){
				System.out.print(" ");
			}

			for(x=1; x<stars*2; x++){
				System.out.print(y);
			}

			System.out.print("\n");

			if(y<rows){
				blank--;
				stars++;
			}else{
				blank++;
				stars--;
			}
		}
 }
}