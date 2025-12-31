public class TwoSumTarget {
    public static int twosum(int[] nums,int target,boolean firstvisited){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while (left <= right) {
                int mid = left + (right - left) / 2;
                if(nums[mid] == target) {
                    result = mid;
                    if (firstvisited) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
           return result;
    }

    public static void main(String[] args) {
        int[] nums={5,7,8,8,8,8,8,9,10,10};

        int target =8;
       int first=twosum(nums,target,true);
        int last = twosum(nums, target, false);
       System.out.println(first+" "+last);
    }
}
