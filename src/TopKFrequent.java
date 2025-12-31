import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
         int[] nums={1,1,1,2,2,3};
         int k =2;
        int[] arr = new int[k];
        int index = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max =0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            maxheap.add(value);
        }
        System.out.println(maxheap);
    }
}
