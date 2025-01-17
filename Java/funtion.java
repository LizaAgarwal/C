//print a given name in a function.

import java.util.Scanner;

public class funtion {
    public static void printName(String name){
        System.out.println(name);
        return; //in case of void return type, we can also avoid writing this return statement
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printName(name);
    } 
}
