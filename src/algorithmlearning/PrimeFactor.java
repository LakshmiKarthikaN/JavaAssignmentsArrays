package algorithmlearning;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String[] args) {
        int n = 60;
        List<Integer> list = new ArrayList<>();
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }if(n>1){
            list.add(n);
        }
        System.out.println(list);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        boolean isSorted = false;
        for(int i =0;i<nums.size()-1;i++){
            if(nums.get(i)<nums.get(i+1)){
                isSorted = true;
            }

            else{
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
