
import java.util.ArrayList;

public class twoDarrayList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();   // declare 2D arrayList

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(list1);   // we can add different lists to 2D arraylist
        list.add(list2);

        System.out.println(list.get(0).get(1));   // to print the 2D arrayList
    }
}
