public class Rearrange {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int i=0;
        int j=1;
        int[] res=new int[nums.length];
        for(int n:nums){
            if(n>0){
                res[i]=n;
                i+=2;
            }else{
                res[j]=n;
                j+=2;
            }
        }  for(int k=0;k<res.length;k++){
              System.out.println(res[k]);
        }
    }
}
