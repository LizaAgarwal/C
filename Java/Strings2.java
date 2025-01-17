import java.util.Scanner;

public class Strings2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fullname=sc.nextLine();
        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
