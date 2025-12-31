import java.util.HashMap;
import java.util.Map;
import java .util.HashSet;
public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph="a.";
        String[] banned={};
        paragraph=paragraph.toLowerCase();
        System.out.println(paragraph);

        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ");
        System.out.println(paragraph);
        String[] str=paragraph.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
     HashSet<String> set=new HashSet<>();
     for(String ban :banned){
         set.add(ban);
     }
     for(String word : str) {
         if (!set.contains(word)){
             map.put(word, map.getOrDefault(word, 0) + 1);
             System.out.println(map);
         }
     }
        int max=0;
        String maxKey="";
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            String key= entry.getKey();
            int value=entry.getValue();
            if(value>max){
                max = value;
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
