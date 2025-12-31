import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class RandomInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random rand=new Random();
        for(int i=0;i<10;i++){
            int randno=rand.nextInt(100)+1;
            list.add(randno);
        }
        System.out.println("Original List:" +list);
        Collections.sort(list);
        System.out.println("Sorted List : "+list);
    }
}
