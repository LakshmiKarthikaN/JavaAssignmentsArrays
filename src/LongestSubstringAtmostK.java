import java.util.HashMap;

public class LongestSubstringAtmostK {
    public static void main(String[] args) {
        String s = "aaabb";
        int k =3;
        int r = 0, l = 0, maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            System.out.println(map);
            if (map.get(rightChar) != null && map.get(rightChar) < k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) != null && map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }System.out.println(map);
            if (map.get(rightChar) != null && map.get(rightChar) >= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            System.out.println(map);
            r++;
        }

        System.out.println(maxlen);
    }
}
