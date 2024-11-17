
import java.util.Scanner;



public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[2];   // array declaration
     //   x[0] = 1;
     //    x[1] = 2;  

        System.out.println(java.util.Arrays.toString(arr));    // we can print using this method

        for(int i = 0; i< arr.length; i++)
        {
           arr[i] = scanner.nextInt();         // to take the input of the array
        }
        
        for(int a :arr)
        {
            System.out.println(a);   // to print the array
        }
    }
    
}
