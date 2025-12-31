public class CountLargedGroup {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;
        int[] arr = new int[n];
        int index = 0;
        int sum = 0;
         for(int i=1;i<=n;i++){
             arr[index++]=i;

         }
        for (int i = 0; i <arr.length; i++) {
            //System.out.println(arr[i]);
            int temp = arr[i];
            while (temp != 0) {
                int r = temp % 10;
                sum += r;
                temp /= 10;
            } if (sum == arr[i]) {
                count++;
            }

        } System.out.println(count);
    }
}
