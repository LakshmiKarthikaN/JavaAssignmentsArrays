public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
//        int l=0;
//        int r=0;
//        int sum =0;
//        while(r<arr.length){
//            if((r-l+1)%2!=0){
//                sum+=arr[r];
//            }else{
//                sum-=arr[l];
//                l++;
//            }r++;
//        }
//        System.out.println(sum);
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                if((j-i+1)%2!=0){
                    sum+=arr[j];
                }
            }
        }
        System.out.println(sum);
    }
}
