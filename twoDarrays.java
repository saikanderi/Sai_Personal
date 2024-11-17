
import java.util.Arrays;
import java.util.Scanner;

public class twoDarrays {

    private static long[] a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][2];
 
        for ( int row = 0; row < arr.length; row++)    // for taking input in 2D arrays
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = scanner.nextInt();
            }
        }

        for ( int row = 0; row < arr.length; row++)    //  to print 2D array
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                System.out.println(arr[row][col]+ " ");
            }
            System.out.println();    // adds space to the next line
        }

        for(int row = 0; row < arr.length; row++)    // to print the 2D array
        {
            System.out.println(Arrays.toString(arr[row]));
        }


        for ( int[] a : arr)         // to print 2D array using the for each loop
       {
       
            System.out.println(Arrays.toString(a));
       }

       scanner.close();
    }
}
