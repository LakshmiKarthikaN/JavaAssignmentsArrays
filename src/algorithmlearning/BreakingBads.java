package algorithmlearning;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class BreakingBads {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int count = 0;
        int count1 =0;
        for(int i = 1;i<scores.size();i++){
            if(min>scores.get(i) && min != scores.get(i)){
                min = scores.get(i);
                count++;
            }
            if(max<scores.get(i) && max != scores.get(i)){
                max = scores.get(i);
                count1++;
            }
        }
        list.add(count);
        list.add(count1);
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,21,36,10, 28,35,5,24,42
        ));
        System.out.println(breakingRecords(list));

    }
}
