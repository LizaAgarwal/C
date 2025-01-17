//print the sum of all odd numbers from 1 to n. 

import java.util.Scanner;

public class function5 {
    public static int printSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }else{
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printSum(n));
    }
}
