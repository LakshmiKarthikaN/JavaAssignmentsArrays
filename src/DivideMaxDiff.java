import java.util.Arrays;

public class DivideMaxDiff {
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k =2;

        int n = nums.length;
        int[][] maxdiff = new int[n/3][3];
        Arrays.sort(nums);
        int row = 0;
        int col = 0;
        if(n%3==0){
            for(int i = 0; i < nums.length; i+=3){
                int a = nums[i];int b=nums[i+1];int c = nums[i+2];
                if(c-a>k){
                    System.out.println(maxdiff[0][0]);
                }
                maxdiff[row][0]=a;
                maxdiff[row][1]=b;
                maxdiff[row][2]=c;
                row++;

            }
        }
        for(int i = 0;i < n/3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(maxdiff[i][j]+"");
            }
        }
    }
}
