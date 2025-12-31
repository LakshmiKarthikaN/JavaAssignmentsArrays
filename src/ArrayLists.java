import java.util.ArrayList;
import java.util.List;
public class ArrayLists {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grapes");
        list.add("Giwi");
        System.out.println("All the fruits in the list: " +list);
        System.out.println("The Third fruit in this list is : " + list.get(2));
    }
}
