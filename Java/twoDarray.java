// declaring a 2D array: type arrayname[][]=new type[rows][columns];
import java.util.Scanner;
public class twoDarray {
    public static void main(Strings args[]){
        //taking numbers as input from the user and printing them.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of rows:");
        int rows=sc.nextInt();
        System.out.print("enter the no of columns:");
        int cols=sc.nextInt();
        int[][] numbers=new int[rows][cols];
        System.out.print("enter the numbers:");
        //no of rows
        for(int i=0;i<rows;i++){
            //no of columns for row 1
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.print("The 2D array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}