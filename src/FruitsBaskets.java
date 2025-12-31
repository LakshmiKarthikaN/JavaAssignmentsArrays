import java.util.HashSet;

public class FruitsBaskets {
    public static void main(String[] args) {
//        int[] fruits ={1,4};
//        int[] baskets={8,1};
//        int count =0;
//        if(baskets[0]<fruits[0] && baskets[0]!=fruits[0]){
//            System.out.println(1);
//        }
//
//        for(int i =0;i<fruits.length;i++){
//            if(fruits[i]<baskets[i]){
//                continue;
//            }else{
//                for(int j = i;j<baskets.length;j++){
//                    if(fruits[i]<baskets[j]){
//                        continue;
//                    }else{
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
        int[] fruits={3,3,3,2,2,1,1,4,3,1};
        int l =0;
        int r=0;
        int maxlen =0;
        HashSet<Integer> set = new HashSet<>();
        while(r<fruits.length){

            set.add(fruits[r]);
            if(set.size()>2){
                set.clear();
                l++;
            }
            if(set.size()==2 || set.contains(fruits[r])){
                maxlen = Math.max(maxlen,r-l+1);
            }r++;
        }
        System.out.println(maxlen);

    }
}
