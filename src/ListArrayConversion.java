import java.util.ArrayList;
import java.util.Arrays;
public class ListArrayConversion {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
         list.add("Tom");
         list.add("Jerry");
         list.add("Spike");
         String[] strarray=list.toArray(new String[0]);
         System.out.println("Array : "+ Arrays.toString(strarray));
         ArrayList<String> list1=new ArrayList<>(Arrays.asList(strarray));
        System.out.println("Arraylists :" + list1);
    }
}
