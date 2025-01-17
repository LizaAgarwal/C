import java.util.Scanner;

public class calculator {
    //Build a calculator using switch
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        System.out.print("enter an operator:");
        char op=sc.next().charAt(0);
        switch(op){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default: System.out.println("wrong operator");
        }
    }
}
