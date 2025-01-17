import java.util.Scanner;

public class conditional2 {
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        // switch
        // press button 1 to say hello, 2 for namaste, 3 for bonjour
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("invalid button");
        }
    }
}
