import java.util.Scanner;

public class countnumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        System.out.println("enter which number you want to find repeating : ");
        int n = scanner.nextInt();
      int  count = 0;
        while (a>0)
        {
            int rem = a % 10;
            if(rem == n)
            {
                count ++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
