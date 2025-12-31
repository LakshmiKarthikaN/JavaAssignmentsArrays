public class GreatestElement {
    public static void main(String[] args) {
            int[] nums1={4,1,2};
             int[] nums2={1,3,4,2};
        int n1= nums1.length;
        int n2= nums2.length;

        int [] pos= new int[10001];
        int ans[]= new int[n1];
        for(int i=0;i<n2;i++){
            pos[nums2[i]]=i;
        }

        for(int i=0;i<n1;i++){

            for(int j=pos[nums1[i]]; j<n2;j++){

                if(nums2[j]> nums1[i])
                {
                    ans[i]= nums2[j];
                    break;
                }
                ans[i]=-1;
            }
      System.out.println(ans[i]);
        }
    }
}
