/*
Problem 10: Write a program to print the number pattern using loop.
12345
23456
34567
45678
56789
*/
public class Problem{
 public static void main(String[] args){
    int row = 5;
    int col = 5;
    int min = 1;
    for(int y = 0; y < row; y++){
        int num = min + y;
        for(int x = 0; x < col; x++){
            System.out.print(num);
            num = num + 1;
        }
        System.out.println();
    }
 }
}