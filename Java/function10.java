//enter two numbers x and n from the user and find the value of one number raised to the power of another number.

import java.util.Scanner;

public class function10 {
    public static double printPower(int x,int n){
        double val=Math.pow(x, n);
        return val;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(printPower(x, n));
    }
}
