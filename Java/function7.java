//take the radius as input and return the circumference of a circle

import java.util.Scanner;

public class function7 {
    public static double printCircum(int r){
        double circum=2*3.14*r;
        return circum;
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(printCircum(r));
    }
}
