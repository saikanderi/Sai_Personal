import java.util.ArrayList;
import java.util.Scanner;

public class averageArray
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter how many elements you want to enter in your arrayList : ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" Element in your arrayList :");
            int element = scanner.nextInt();
            list.add(element);

        }
        int eleCount = 0;
        int count = 0;

                                                                      // count the sum of array

        for(int i = 0; i < n; i++)
        {
            int element = list.get(i);
            count += element;
        }
        
        for(int i = 0; i < n; i++)                                // count the total elements in an array
        {
            int element = list.get(i);
            eleCount++;
        }

                                                                // find the average in an array
            double average = count / eleCount;

            // double average = count / list.size();          // alternate method

            System.out.println("Average of your array is : "+average);

            scanner.close();
    }
}