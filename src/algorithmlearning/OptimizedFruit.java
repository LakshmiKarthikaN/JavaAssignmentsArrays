package algorithmlearning;

public class OptimizedFruit {

        public static void main(String[] args) {
            int[] nums = {3,3,3,1,2,1,1,2,3,3,4};

            int type1 = -1, type2 = -1;
            int count1 = 0, count2 = 0;
            int l = 0, maxLen = 0;

            for (int r = 0; r < nums.length; r++) {

                if (nums[r] == type1) {
                    count1++;
                } else if (nums[r] == type2) {
                    count2++;
                } else if (type1 == -1) {
                    type1 = nums[r];
                    count1 = 1;
                } else if (type2 == -1) {
                    type2 = nums[r];
                    count2 = 1;
                } else {
                    // third fruit → shrink window
                    while (count1 > 0 && count2 > 0) {
                        if (nums[l] == type1) count1--;
                        else count2--;
                        l++;
                    }

                    if (count1 == 0) {
                        type1 = nums[r];
                        count1 = 1;
                    } else {
                        type2 = nums[r];
                        count2 = 1;
                    }
                }

                maxLen = Math.max(maxLen, r - l + 1);
            }

            System.out.println(maxLen);
        }
    }


