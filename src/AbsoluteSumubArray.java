public class AbsoluteSumubArray {
    public static void main(String[] args) {
        int[] nums={3,1,4,1,5};
        int currentmax=0;
        int currentmin=0;
        int maxsum=0;
        int minsum =0;
//        while(r<nums.length){
//            sum+=nums[r];
//            sum=Math.abs(sum);
//            max=Math.max(sum,max);
//            l++;
//            r++;
//        }
////        System.out.println(max);
//        for(int i =0; i<nums.length;i++){
//            for(int j =i;j<nums.length;j++){
//                sum+=nums[j];
//                sum=Math.abs(sum);
//                max=Math.max(sum,max);
//
//            }
//        }
//        System.out.println(max);
//        for(int num: nums){
//            currentmax=Math.max(currentmax+num,num);
//            maxsum = Math.max(maxsum,currentmax);
//            currentmin=Math.min(currentmin+num,num);
//            minsum = Math.min(minsum,currentmin);
//        }
//        System.out.println(Math.max(maxsum,Math.abs(minsum)));
        int k =2;
        int count =0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
