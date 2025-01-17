import java.util.Scanner;
public class loops5 {
    public static void main(Strings args[]){
        //print the sum of first n natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<n+1){
            sum=sum+i;
            i++;
        }
        System.out.println("sum is:"+sum);
    }
}
