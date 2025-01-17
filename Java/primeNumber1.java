import java.util.Scanner;

public class primeNumber1 {
    public static void main(String args[]){
        //find if a number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not prime");
        }else if(n==2){
            System.out.println("prime");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
