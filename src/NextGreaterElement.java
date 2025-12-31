public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] nums=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int foundIndex=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    foundIndex=j;
                    break;
                }
            }int nextGreater=-1;
            for(int k=foundIndex+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    nextGreater=nums2[k];
                    break;
                }

            }  nums[i]=nextGreater;
        }
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums[i]);
        }
    }
}
