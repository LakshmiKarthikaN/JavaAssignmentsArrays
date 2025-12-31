public class FrequencyArray {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] freq=new int[1001];
        for(int i:nums1){
            freq[i]=1;
        }
        int count=0;
        for(int i:nums2){
            if(freq[i]==1){
                freq[i]=2;
                count++;
            } freq[i]=1;
        }int[] intersection=new int[count];
        int index=0;
        for(int i:nums2){
            if(freq[i]==1){

                intersection[index++]=i;


            }
        }for(int i=0;i<count;i++){
            System.out.println(intersection[i]);
        }
    }
}
