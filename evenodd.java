import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        if(x%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
        scanner.close();
    }
}