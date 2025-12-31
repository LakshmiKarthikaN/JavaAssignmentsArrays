package algorithmlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

        public static int[] intersect(int[] nums1, int[] nums2) {

            int[] freq = new int[1001];

            for (int n : nums1) {
                freq[n]++;
            }
            int k = 0;
            for (int n : nums2) {
                if (freq[n] > 0) {
                    nums2[k++] = n;
                    freq[n]--;
                    System.out.println(Arrays.toString(freq));
                }
            }System.out.println(Arrays.toString(freq));


            int[] result = new int[k];
            System.arraycopy(nums2, 0, result, 0, k);

            return result;
        }


    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersect(nums1,nums2));
    }
}
