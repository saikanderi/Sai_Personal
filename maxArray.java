
import java.util.ArrayList;
import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter how many elements you want to enter in Arraylist : ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" element in this array list : ");
            int element = scanner.nextInt();
            list.add(element);
        }

       int max = list.get(0);

       for(int i = 0; i < n; i++)      // logic
       {
        if(max < list.get(i))
        {
            max = list.get(i);
        }
       }

       System.out.println("Max element in this array is : "+max);

       scanner.close();
    }
}
