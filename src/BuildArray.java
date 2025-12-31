class Solutio{
    public int[] buildArray(int[] nums) {
        apermutation(nums, 0);
        return nums;
    }

    void apermutation(int[] nums, int start) {
        if (start < nums.length) {
            int temp = nums[start];
            int result = nums[temp];
            apermutation(nums, start + 1);
            nums[start] = result;
        }
    }
}

public class BuildArray {
    public static void main(String[] args) {
        Solutio sol = new Solutio();

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = sol.buildArray(nums);

        System.out.print("Result array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
