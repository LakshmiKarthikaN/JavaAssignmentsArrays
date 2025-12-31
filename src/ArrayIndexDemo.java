public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element at index 5: " + nums[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:  Invalid array index.");
        }

    }
}
