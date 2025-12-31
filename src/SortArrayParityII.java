public class SortArrayParityII {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,4,3,2};
        int[] num=new int[nums.length];

//        int index=0;
//        for(int i=0;i<nums.length && index<nums.length;i++){
//            if(nums[i]%2==0){
//
//                num[index]=nums[i];
//                index+=2;
//            }else{
//                if(index%2==0) {
//                    index = 1;
//                }else{
//                    index=index;
//                }
//                num[index]=nums[i];
//                if(nums.length>2) {
//                    index += 2;
//                }
//            }
//        }for(int n:num){
//            System.out.println(n);
//        }
        int evenCount=0;
        int oddCount=nums.length-1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               num[evenCount]=nums[i];
               evenCount+=2;
           }else{
               num[oddCount]=nums[i];
               oddCount-=2;
           }


       }
       for(int n:num){
            System.out.println(n);
      }

    }
}
