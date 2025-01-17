import java.util.Scanner;

public class continueStatement1 {
    public static void main(String[] args) {
        //display all numbers entered by users except multiples of 10
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter a number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
