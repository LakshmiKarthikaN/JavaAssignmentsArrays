import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (r<nums2.length && l<nums1.length) {
            if (nums1[l] == nums2[r]) {
                list.add(nums1[l]);
                 r++;
            } else {
                l++;
            }

        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }




    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
}
    }

