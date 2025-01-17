import java.util.Scanner;

public class conditional {
    public static void main(String args[]){
        //if-else
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}
