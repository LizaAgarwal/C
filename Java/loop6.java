import java.util.Scanner;
public class loop6 {
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        //print the table of a number input by user
        int n=sc.nextInt();
        int i=1;
        while(i<11){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
}
