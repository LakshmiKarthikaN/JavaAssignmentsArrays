import java.util.ArrayList;
import java.util.List;

public class DistantIndex {
    public static void main(String[] args) {
        int[] nums={2,1,2,3,4,2,6,7,2,9,2};
        int key =2;
        int k =1;
        List<Integer> list = new ArrayList<>();
        List<Integer> uniquekey = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==key){
                uniquekey.add(i);
            }
        }System.out.println(uniquekey);


        for(int i = 0;i<nums.length;i++){

//              if(index < uniquekey.size()) {
//                  if (Math.abs(i - uniquekey.get(index)) <= k) {
//                      list.add(i);
//                  } else {
//                      index++;
//                      if (index < uniquekey.size() && Math.abs(i - uniquekey.get(index)) <= k) {
//                          list.add(i);
//                      }
//                  }
//              }index = 0;
            for(int index : uniquekey){
                if(Math.abs(i-index)<=k){
                    list.add(i);
                    break;
                }
            }
            System.out.println(list);
        }System.out.println(list);
    }
}
