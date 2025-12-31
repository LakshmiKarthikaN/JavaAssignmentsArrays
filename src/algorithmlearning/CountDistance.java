package algorithmlearning;

public class CountDistance {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int l = 0;
        int r=0;
        int count = 0;
        int count1=0;
        int len = 0;
        if(arr1.length<arr2.length){
            len = arr2.length;
        }else{
            len = arr1.length;
        }
        while(r<len) {
            int dist = Math.abs(arr1[l]-arr2[r]);
            if(dist>d){
                count++;
            }
            if(count == arr2.length){
                count1++;
            }
            r++;
            if(r==arr2.length){
                l++;
                r=0;
                count=0;
            }
            if(l==arr1.length-1){
                break;
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2= {10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));

    }
}
