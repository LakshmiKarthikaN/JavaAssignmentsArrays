package linkedlistremove;

import java.util.*;

public class MaximumErasure {
    public static int CountPairs(List<Integer> nums,int target){

        Collections.sort(nums);
        System.out.println(nums);
        int left=0;
        int count=0;
        int right = nums.size()-1;
        while(left<=right){
            if(nums.get(left)+nums.get(right)<target){
                count+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public static int MaxCountPairs(int[] arr,int lower,int upper){
        Arrays.sort(arr);
        int left =0;
        int right=arr.length-1;
        int count=0;
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        while(left<=right){
            int sum = arr[left]+arr[right];
            System.out.println(sum);
            if(lower<=sum && sum<=upper){
                count++;
                right--;
            }else{
                left++;
            }
        }
        return count;
    }
    public static int ErasureValue(int[] nums){
        int l =0;
        int r=0;
        int sum=0;
        int maxsum=0;
        HashSet<Integer> set = new HashSet<>();
        while(r<nums.length){
             sum+=nums[r];
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum=sum-nums[l];
                l++;
            }


                System.out.println(sum);
                if(!set.contains(nums[r])){
                    maxsum = Math.max(sum, maxsum);
                    System.out.println(maxsum);
                }
                set.add(nums[r]);
                System.out.println(set);
            r++;
        }
        return maxsum;
    }

    public static void main(String[] args) {

        int[] nums = {5,2,1,2,5,2,1,2,5};
        int[] arr={0,1,7,4,4,5};
        int lower =3;
        int upper =6;
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(-1);
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(1);
        int target=2;
        //System.out.println(MaximumErasure.CountPairs(nums1,target));
        System.out.println(MaximumErasure.MaxCountPairs(arr,lower,upper));

    }
}
