package algorithmlearning;

import java.util.*;

public class PairSocks {
    public static int sockMerchant(int n, List<Integer> ar) {
//        // te your code here
//        int[] freq = new int[101];
//        int count = 0;
//        for(int i = 0;i<ar.size();i++){
//            freq[ar.get(i)]++;
//        }
//        for(int i =0;i<101;i++){
//            if(freq[i]!=0){
//                count= count+(freq[i]/2);
//            }
//        }
//        return count;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<ar.size();i++) {
            map.put(ar.get(i),map.getOrDefault(ar.get(i),0)+1);
        }
        System.out.println(map);
       int pairs = 0;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           int value = entry.getValue();
           pairs = pairs + (value/2);

       }
       return pairs;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 20, 20, 1, 1, 30, 50, 1, 20));
        int n =9;
        System.out.println(sockMerchant(n,list));
    }
}
