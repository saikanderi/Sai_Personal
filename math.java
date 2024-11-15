import java.util.Scanner;

public class math {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number :");
        int a = scanner.nextInt();
        System.out.print("Enter second number :");
        int b = scanner.nextInt();
        int c = Math.max(a, b);    //  max btw two numbers
        int d = Math.abs(a);       // gives the absolute value of a  --> number without negative sign
        double e = Math.sqrt(a);      // gives the square root of a
        int f = Math.round(a);      //  rounds up the value
        double g =  Math.floor(a);     //  rounds to the value
        System.out.println("Maximum of two number is :"+c);
    }
    
}
