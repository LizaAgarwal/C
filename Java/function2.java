//make a function to multiply two numbers and return product

import java.util.Scanner;

public class function2 {
    public static int calcProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calcProduct(a, b));
    }
}
