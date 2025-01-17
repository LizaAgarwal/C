import java.util.Scanner;

public class conditional3 {
    //Build an income tax calculator
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your income:");
        int income=sc.nextInt();
        int tax; //tax will be assigned the value 0
        if(income<500000){
            tax=0;
        }else if(income>=500000 && income<1000000){
            tax=(int)(0.2*income);
        }else{
            tax=(int)(0.3*income);
        }
        System.out.println("tax is:"+ tax);
    }
}
