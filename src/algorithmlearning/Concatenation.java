package algorithmlearning;

public class Concatenation {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        long result = 0;

        while (left <= right) {
            String sb = "";

         if(left!=right) {
             sb += nums[left];
             sb += nums[right];

             int concat = Integer.parseInt(sb);
             System.out.println(sb);
             System.out.println(concat);

             result += concat;
         }else{
             result+=nums[left];
         }
            left++;
            right--;
        }
        return result;

    }
        public static void main (String[]args){
            System.out.println("Try programiz.pro");
            int[] nums = {5, 14, 13, 8, 12};
            System.out.println(findTheArrayConcVal(nums));

        }
    }


