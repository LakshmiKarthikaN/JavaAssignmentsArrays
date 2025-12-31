package algorithmlearning;

public class continousSubarrayMax {
    public static void main(String[] args) {
        int[] nums={3,2,1,4,5};
        int k =3;
        int l = 0;
        int r = k;
        int max = 0;
        for(int i = 0;i<r;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        for(int i = k;i<nums.length;i++){
            if(max<nums[i]){
                max= nums[i];
            }
        }
        System.out.println(max);
    }
}
