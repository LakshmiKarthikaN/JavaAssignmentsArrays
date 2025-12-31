import java.util.HashMap;
import java.util.Map;
public class MostFrequentEven {
    public static void main(String[] args) {
        int[] nums={8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        HashMap<Integer,Integer> map=new HashMap();
        for(int n:nums){
            if(n%2==0){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }System.out.println(map);
        int max=0;
        int minkey=0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>=max){
                max=value;
                minkey=key;
                System.out.println(max);

            } if(minkey<=key){
                minkey=key;
                System.out.println(minkey);
            }
        }
        System.out.println(minkey);
    }
}
