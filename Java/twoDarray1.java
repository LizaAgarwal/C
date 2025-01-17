import java.util.Scanner;

public class twoDarray1 {
    public static void main(Strings args[]){
        //take a 2Darray as input from the user. Search for a given number x and print the index at which it occurs.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of rows:");
        int rows=sc.nextInt();
        System.out.print("enter the no of columns:");
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        System.out.print("enter the numbers:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter a number x:");
        int x=sc.nextInt();
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (x==numbers[i][j]){
                    System.out.println("x is at index:"+i+","+j);
                }
            }
        }
    }
}
