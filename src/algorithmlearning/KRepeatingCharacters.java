package algorithmlearning;

import java.util.HashMap;

public class KRepeatingCharacters {
    public static int longestSubstring(String s, int k) {
    int l = 0;
    int r = 0;
    int maxlen = 0;
    HashMap<Character,Integer> map = new HashMap<>();
    while(r<s.length()){
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
        if(map.get(s.charAt(l))<k && map.size()!=0){
            map.remove(s.charAt(l));
            l++;
        }
        if(map.get(s.charAt(r))<=k){
            maxlen = Math.max(maxlen,r-l+1);
        }r++;
    }
    return maxlen;
}

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 2;
        System.out.println(longestSubstring(s,k));
    }
}
