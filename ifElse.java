
import java.util.Scanner;

// create an calculator program which prints the output based on user input

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        double x = scanner.nextDouble();
        System.out.print("Enter another number : ");
        double y = scanner.nextDouble();
        System.out.print("Enter what kind of operation you want to perform : ");
        char a = scanner.next().charAt(0);


        if (a == '+')
        {
            System.out.println((x+y));
        }
        
        else 
        {
            System.out.println("Enter correct operation");
        }
        scanner.close();
    }
}
