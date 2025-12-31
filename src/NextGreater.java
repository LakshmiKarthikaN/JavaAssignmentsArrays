public class NextGreater {
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                for(int k=j+1;k<nums2.length-1;k++){
                    if(nums1[i]==nums2[k]){
                        if(nums2[k]<nums2[k+1]){
                            nums1[i]=nums2[k+1];

                        }
                    }else{
                        nums1[i]=-1;
                    }
                }
            }
        }for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}

