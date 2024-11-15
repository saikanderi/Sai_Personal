
import java.util.Scanner;

// calculator program 

public class switchoperation {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int a = scanner.nextInt();
        System.out.print("Enter your operation : ");
        char c = scanner.next().charAt(0);
        System.out.println("Enter another number : ");
        int b = scanner.nextInt();
        int result;

        switch (c) {
            case '+' :
                result = a+b;
                break;
            case '-' :
                  result = a-b;
                  break;

            case '*' :
                 result = a*b;
                 break;
            default:
                System.out.println("Enter correct operation");
                return;
        }

        System.out.println(result);
        scanner.close();
    }
}
