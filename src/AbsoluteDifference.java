import java.util.ArrayList;
import java.util.List;

public class AbsoluteDifference {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(330702844);
        nums.add(313481959);
        nums.add(239224564);
        nums.add(609763700);
        nums.add(170531905);
        int x = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.size();i++){
            for(int j = i+1;j < nums.size();j++){
                if(Math.abs(i-j)>=x){
                    int diff = Math.abs(nums.get(i)-nums.get(j));
                    min = Math.min(min,diff);
                }
            }
        }
        System.out.println(min);
    }
}
