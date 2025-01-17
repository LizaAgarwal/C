//enter the nos till the user wants and at the end display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class function9 {
    public static void printCount(int i,int n){
        int pos=0;
        int neg=0;
        int zero=0;
        while(i==1){
            if (n<0){
                neg+=1;
            }else if(n==0){
                zero+=1;
            }else{
                pos+=1;
            }
        }
        System.out.println("count of positives:"+pos);
        System.out.println("count of zeros:"+zero);
        System.out.println("count of negatives:",neg);
        return;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 to continue or 0 to end:");
        int i=sc.nextInt();
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("enter 1 to continue or 0 to end");
        i=sc.nextInt();
        printCount(i,n);
    }
}

