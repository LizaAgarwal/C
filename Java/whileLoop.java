import java.util.Scanner;

public class whileLoop {
    public static void main(String args[]){
        //reading user input until a specific condition is satisfied:
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter 'exit' to quit: ");
            input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
        }
        scanner.close();

    }
}
