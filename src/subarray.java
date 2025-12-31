public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
       int sum=0;int count=0;
        for (int i = 0; i< arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]+ " ");
                    sum+=arr[k];

                }if(sum==3){
                    count++;
                }

            }
        } System.out.println(count);
    }
}
