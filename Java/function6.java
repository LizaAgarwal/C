//Take two numbers from user and return the greater of those two

import java.util.Scanner;

public class function6 {
    public static void printGreat(int a,int b){
        if (a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
        return;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printGreat(a, b);
    }
}
