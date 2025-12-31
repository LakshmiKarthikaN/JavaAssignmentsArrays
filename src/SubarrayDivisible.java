public class SubarrayDivisible {
    public static void main(String[] args) {

           int[] nums = {4,5,0,-2,-3,1};
           int k = 5;
                int l =0;
                int r =0;
                int sum = 0;
                int count = 0;
                while(r<nums.length){
                    sum+=nums[l];
                    if(sum%k==0){
                        count++;
                    }else{
                        l++;

                    }
                    r++;
                }
            System.out.println(count);
            }

    }

