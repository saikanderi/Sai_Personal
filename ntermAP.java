
import java.util.Scanner;

// Find the nth term in an AP given the starting term and the difference between the terms  formula is a + (n-1)*d


public class ntermAP {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first term in AP :");
        int a = scanner.nextInt();
        System.out.println("Enter the difference between the terms :");
        int d = scanner.nextInt();
        System.out.println("Enter which term you want to find in the AP :");
        int n = scanner.nextInt();
        int ans = a + (n-1) * d;
        System.out.println("Your "+n+" term in your AP is : "+ans);
        scanner.close();
    }
    
}
