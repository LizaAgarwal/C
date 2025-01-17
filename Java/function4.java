//enter 3 numbers from the user and make a function to print their average.

import java.util.Scanner;

public class function4 {
    public static float printAvg(int a,int b,int c){
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(printAvg(a, b, c));
    }
}
