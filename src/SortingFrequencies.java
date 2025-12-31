import java.util.HashMap;
import java.util.Map;

public class SortingFrequencies {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        int[] arr = new int[nums.length];
        int index=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        int min =Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (min > value) {
                min = value;
                arr[index++]=key;
                System.out.println(min);
            }

        }
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        //{3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}
//        int[] freq=new int[100];
//        for(int num:nums){
//            freq[num]++;
//        }
//        int[] unique=new int[100];
//        int count=0;
//        for(int num:nums){
//            boolean found=false;
//            for(int i=0;i<count;i++){
//                if(unique[i]==num){
//                    found=true;
//                    break;
//                }
//            }if(!found){
//                unique[count++]=num;
//            }
//        }
//        for(int i=0;i<count;i++){
//            for(int j=i+1;j<count;j++){
//                if(freq[unique[i]]<freq[unique[j]] || (freq[unique[i]]==freq[unique[j]] && unique[j]<unique[i])){
//                    int temp=unique[i];
//                    unique[i]=unique[j];
//                    unique[j]=temp;
//                }
//            }
//        }int index=0;
//        for(int i=0;i<count;i++){
//            for(int j=0;j<freq[unique[i]];j++){
//                nums[index++]=unique[i];
//            }
//        }
//
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//        }
//        for(int i=0;i<100;i++){
//            for(int j=i+1;j<100;j++) {
//                if (freq[j] != 0) {
//                    if (freq[i] > freq[j] && index < nums.length) {
//                        int temp=i;
//                        i=j;
//                        nums[index++]=temp;
//                    } else {
//                        if (freq[i] == freq[j] && index < nums.length) {
//                            if (i > j) {
//                                int temp=i;
//                                i=j;
//                                nums[index++]=temp;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        //int[] nums={2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};


    }
}
