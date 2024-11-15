
import java.util.Scanner;

public class fibonacii
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the nth term of the fibonacii number : ");
        int n = scanner.nextInt();

        if(n < 0)
        {
            System.out.println("Enter correct number ");
        }
        else{
            int fibonaciinumber = findfibonacii(n);
            System.out.println("Your number is : "+fibonaciinumber);
        }
        scanner.close();
    }
        
        public static int findfibonacii(int n)
        {
            int a = 0;
            int b = 1;
            int fibonacii = 0;
            if(n == 1)
            {
                return 0;
            }
            else if (n ==1)
            {
                return 1;
            }

            for ( int i = 2; i<=n; i++)
            {
                fibonacii = a + b;
                a = b;
                b = fibonacii;
            }
            return fibonacii;
        }
    }