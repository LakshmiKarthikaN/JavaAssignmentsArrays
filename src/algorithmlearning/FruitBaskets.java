package algorithmlearning;

import java.util.HashMap;
import java.util.HashSet;

public class FruitBaskets {
    public static void main(String[] args) {
        int[] nums = {3,3,3,1,2,1,1,2,3,3,4};
        int r = 0;
        int l =0;
        int maxlen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            System.out.println(map);
            if(map.size()>2){
                map.put(nums[l],map.get(nums[l])-1);
                System.out.println(map);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                    System.out.println(map);
                }
                l++;
            }
            if(map.size()<=2){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        System.out.println(maxlen);
    }
}
