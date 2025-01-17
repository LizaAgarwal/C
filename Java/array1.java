import java.util.Scanner;

public class array1 {
    public static void main(String args[]){
        //taking numbers as input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.print("enter the numbers:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("the numbers are:");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
