import java.util.ArrayList;
import java.util.List;

public class MaxPoints {
    public static void main(String[] args) {
//        int[][] points={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
//        int count=0;
//        for(int i =0;i<points.length;i++){
//            if(points[i][1]==points[1][i]){
//                count++;
//            }
//        }
//        System.out.println(count);
//        int[] nums={2,5,1,3,4,7};//shuffle Array
//        int n=3;
//        int left =0;
//        int right =n;
//        int[] num = new int[nums.length];
//        for(int i =0;i<nums.length;i++){
//            if(left<right && right <nums.length){
//                if(i%2==0){
//                    num[i]=nums[left++];
//                }else{
//                    num[i]=nums[right++];
//                }
//            }
//            System.out.println(num[i]);
//        }for(int i =0;i<nums.length;i++){
//            System.out.println(num[i]);
//        }
        int[] nums={-100,-98,-1,2,3,4};
        int mul =1;
        int max =Integer.MIN_VALUE;
//        for(int i =0;i<nums.length;i++){
//            mul=1;
//            for(int j =i;j<i*3 && j<nums.length;j++){
//                mul*=nums[j];
//                max=Math.max(max,mul);
//                System.out.println(mul);
//                System.out.println(max);
//            }
//        }
//        System.out.println(max);
//       int l =0;
//       int r=0;
//       while(r<nums.length){
//           mul*=nums[r];
//           if(r-l+1==3){
//               max =Math.max(max,mul);
//               mul/=nums[l];
//               System.out.println(mul);
//               System.out.println(max);
//               l++;
//           }r++;
//       }
//        System.out.println(max);
//        for(int i =0;i<nums.length;i++){ //maximum product three numbers
//            mul=1;
//            for(int j =i;j<nums.length;j++){
//                mul*=nums[j];
//                if(j-i+1==3){
//                    max=Math.max(max,mul);
//
//                }
//            }
//        }
//        System.out.println(max);
//        int[] freq = new int[101];//two out of three
//        int[] nums1={1,3};
//        int[] nums2={2,3};
//        int[] nums3={1,2};
//        List<Integer> list = new ArrayList<>();
//
//        boolean flag = false;
//
//        for(int num1 : nums1){
//            freq[num1]=1;
//        }
//        for(int num2 : nums2){
//
//            if(freq[num2]==1){
//
//                list.add(num2);
//                flag=true;
//            }else{
//                freq[num2]=2;
//            }
//        }
//
//            for(int num3 : nums3){
//                if((freq[num3]==2 || freq[num3]==1) && !list.contains(num3)){
//                    list.add(num3);
//                }
//            }
//
//        System.out.println(list);
        int[] arr={1,4,2,5,3};
       int sum=0;
        for(int i =0;i<arr.length;i++){

            for(int j =i;j<arr.length;j++){
                int len =j-i+1;
                if(len%2!=0){
                    sum+=arr[j];

                }
            }
        }
        System.out.println(sum);
    }
}
