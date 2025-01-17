//make a function to add two numbers and return sum

import java.util.Scanner;

public class function1 {
    public static int calcSum(int a,int b){//here a and b are called parameters or formal parameters in function definition
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calcSum(a, b));//here a and b are called arguments or actual parameters in function call
    }
}
