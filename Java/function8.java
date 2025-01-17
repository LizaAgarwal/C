//takes in age of a person as input and returns if that person is eligible to vote or not.

import java.util.Scanner;

public class function8 {
    public static void checkEligibility(int age){
        if (age>18){
            System.out.println("person is eligible to vote");
        }else{
            System.out.println("person is not eligible to vote");
        }
        return;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        checkEligibility(age);
    }
}
