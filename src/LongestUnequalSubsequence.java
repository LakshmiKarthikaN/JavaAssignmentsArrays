import java.util.List;
import java.util.ArrayList;
public class LongestUnequalSubsequence {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        int[] groups={0,0};
        String[] words={"lr","h"};
        list.add(words[0]);
        int largeGroup=groups[0];
       for(int i=0;i<words.length;i++){
           if(groups[i]!=largeGroup){
               list.add(words[i]);
               largeGroup=groups[i];
           }
       }


        System.out.println(list);
    }
}
