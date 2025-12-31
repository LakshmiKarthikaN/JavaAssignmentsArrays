package algorithmlearning;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "cadbzabcd";
        int l = 0;
        int r = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            System.out.println(set);
            maxlen = Math.max(maxlen,r-l+1);

            System.out.println(maxlen);
            r++;
        }
        System.out.println(set);
        System.out.println(maxlen);
    }
}
