import java.util.ArrayList;
import java.util.Iterator;
public class IteratorElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(25);
        list.add(35);
        list.add(34);
        list.add(10);
        Iterator<Integer> iter=list.iterator();
        while(iter.hasNext()){
            int value=iter.next();
            if(value>30){
                iter.remove();
            }
        }System.out.println(list);
    }
}
