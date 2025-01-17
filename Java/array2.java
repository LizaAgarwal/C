import java.util.Scanner;

public class array2 {
    public static void main(String args[]){
        //take an array as input from the user. Search for a given number x and print the index at which it occurs.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.print("enter the numbers:");
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("enter a number x:");
        int x=sc.nextInt();
        for (int i=0;i<size;i++){
            if(x==numbers[i]){
                System.out.println("The required index is:"+i);
            }
        }
    }
}
