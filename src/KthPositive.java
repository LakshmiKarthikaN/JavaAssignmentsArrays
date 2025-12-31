import java.util.ArrayList;
import java.util.List;

public class KthPositive {
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};
            int k = 3;
//        int[] freq = new int[1001];
//        List<Integer> list = new ArrayList<>();
//        for(int n : arr){
//            freq[n]++;
//        }
//        for(int i = 1;i < 1001;i++){
//            if(freq[i]==0){
//                list.add(i);
//            }
//
//        }System.out.println(list);
//        if(list.size()< k){
//            System.out.println("0");
//        }else{
//            System.out.println(list.get(k-1));
//        }
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(k+high+1);

    }
}
