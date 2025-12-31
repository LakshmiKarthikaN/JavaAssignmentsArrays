package algorithmlearning;

import java.util.HashMap;

public class LongestSubStringK {
    public static int longestKSubstr(String s, int k) {
        // code here
        int l = 0;
        int r = 0;
        int maxlen = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if (map.size() == k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;

        }
        return maxlen;
    }
        public static void main (String[]args){
        String s ="aaaa";
        int k = 2;
        System.out.println(longestKSubstr(s,k));
        }

}
