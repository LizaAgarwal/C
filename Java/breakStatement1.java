import java.util.Scanner;

public class breakStatement1 {
    public static void main(String[] args) {
        //keep entering numbers till user enters a multiple of 10
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter a number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
