package algorithmlearning;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {100,200,300,400};
        int k =2;
        int maxsum = 0;
        int currentsum = 0;
        for(int i = 0;i<k;i++){
            currentsum+=nums[i];
        }
        maxsum = currentsum;
        for(int i = 1;i<=nums.length-k;i++){
            currentsum =currentsum -nums[i-1]+nums[i+k-1];
            if(maxsum < currentsum){
                maxsum = currentsum;
            }
        }
        System.out.println(maxsum);
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int num = row;              // starting number of each row
            int gap = n - 1;            // initial gap

            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num += gap;             // next diagonal number
                gap--;                  // gap decreases after every print
            }

            System.out.println();
        }
    }

}
