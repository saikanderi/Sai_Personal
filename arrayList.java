
import java.util.ArrayList;
import java.util.Scanner;



public class arrayList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> arrList = new ArrayList<>();   // initialixe the array list
        
        arrList.add(2);
        arrList.add(4);

        System.out.println(arrList);   // to print the array list


        for ( int i = 0; i < arrList.size(); i++)   // to take the input for the arrayList
        {
            int element = scanner.nextInt();
            arrList.add(element);
        }

        for ( int i = 0; i < arrList.size(); i++)    // to Print the arrayList
        {
            System.out.println(arrList.get(i));
        }
    }
}


/*
 * 
 * Methods in ArrayList
 * 
 * list.contains();
 * List.set(0, 99);   0--> index  99---> value
 * list.remove(2);    2 --> index
 * list.clear();
 * 
 */