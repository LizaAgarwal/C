//find the factorial of a number

import java.util.Scanner;

public class function3 {
    public static void printFact(int n){
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFact(n);
    }
}
