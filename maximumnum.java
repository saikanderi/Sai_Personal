
import java.util.Scanner;

public class maximumnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        
        if(b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }

        System.out.println(max);
        scanner.close();




      /*  

        */

  // int max = Math.max(c, Math.max(a,b));
    
        /*
         * max  = 0;
         * if(a>b)
         * max = a
         * else 
         * max =  b;
         * if ( c > max)
         * max = c;
         * print max;
         */
    }
    
}
