// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
class Practice {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums = {3,3,3,1,2,1,1,2,3,3,4};
        int l =0;
        int r=0;
        int maxlen =0;
        HashSet<Integer> set = new HashSet<>();

        while(r<nums.length){

            set.add(nums[r]);
            System.out.println(set);
            if(set.size()>2){
                set.remove(nums[l]);
                l++;
            }
            if(set.size()==2){
                maxlen = Math.max(maxlen,r-l+1);
            }r++;
        }
        System.out.println(maxlen);
    }
}