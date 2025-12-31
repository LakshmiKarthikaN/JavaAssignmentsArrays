public class ZeroArray {
    public static void main(String[] args) {

        int[][] queries={{1,3},{0,2}};
        int[] nums={4,3,2,1};
        boolean[] iszero=new boolean[nums.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start;j<=end;j++){
                nums[j]=nums[j]-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                iszero[i]=true;
            }
            else{
                iszero[i]=false;
            }
        }
        for(int i=0;i<iszero.length;i++){
            if(iszero[i]==true){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
