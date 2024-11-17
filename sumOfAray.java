
import java.util.ArrayList;
import java.util.Scanner;

public class sumOfAray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter total how many values you want to enter : ");   // take total values to determine the size of arrayList to run the for loop
        int n = scanner.nextInt();

        System.out.println("Enter the values in an array");

        for( int i = 0; i < n; i++)    // take input from the user for the arrayList
        {
           int element = scanner.nextInt();
           list.add(element);
        }

        for(int i = 0; i < n; i++)    // add the elements to the count variable
        {
            int a = list.get(i);
            count += a;
        }

        System.out.println("Total count of elements in arrayList is : "+count);   // print the count variable

        scanner.close();
        
    }
    
}
