public class SubArray {
    public static void SubArraySum(int[] arr,int k) {
        //int sum=0;
        //int max=0;
        int[] temp=new int[arr.length];
        temp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            temp[i] = temp[i - 1] + arr[i];
        } int max = temp[k - 1];
        int start=0;
        for (int i = k; i < arr.length; i++) {
            int sum = temp[i] - temp[i - k];
            if(sum> max){
                max=sum;
                start=i-k+1;
            }
        }for (int i = start; i < start+k; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(max);
    }
    public static void main(String[] args){
            int[] arr={2,7,4,1,3,2,9,1};
            int k=3;
            SubArray.SubArraySum(arr,k);
    }

}//        for (int i = 0; i < arr.length; i++) {
//            sum=0;
//            for (int j = i; j < i+k && j<arr.length; j++) {
//                   sum+=arr[j];
//                   max=Math.max(sum,max);
//            }
//        }return max;
