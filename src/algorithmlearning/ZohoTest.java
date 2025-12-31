package algorithmlearning;

import java.util.HashMap;

public class ZohoTest {
    public static int solve(int n) {
        int count = 0;

        for(int i = 1;i<=n;i++){
            boolean isRotated = false;
            boolean check = false;
            int temp = i;
            while(temp>0){
                int r = temp%10;
                if(r==3 || r==4 || r==7){
                    check = true;
                    break;
                }
                if(r==2 || r==9 || r==5 || r==6){
                    isRotated = true;
                }
                temp/=10;
            }
            if(!check && isRotated){
                count++;
            }
        }
        return count;
    }

        public static String minWindow(String s, String t) {

            if (s.length() < t.length()) return "";

            // Step 1: Frequency map for t
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : t.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            System.out.println(map);

            int left = 0, right = 0;
            int required = 0;

            int minLen = Integer.MAX_VALUE;
            int start = 0;

            // Step 2: Sliding window
            while (right < s.length()) {
                char rChar = s.charAt(right);

                if (map.containsKey(rChar)) {
                    if (map.get(rChar) > 0) {
                        required++;
                    }
                    map.put(rChar, map.get(rChar) - 1);
                    System.out.println(map);
                }

                right++;

                // Step 3: Try shrinking window
                if (required == t.length()) {
                    if (right - left > minLen) {
                        minLen = right - left;
                        start = left;
                    }
                    char lChar = s.charAt(left);
                    if (map.containsKey(lChar)) {
                        map.put(lChar, map.get(lChar) + 1);
                        System.out.println(map);
                        if (map.get(lChar) > 0) {
                            required--;
                        }
                    }
                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        }





    public static void main(String[] args) {
        int n = 0;
        System.out.println(solve(n));
        System.out.println(minWindow("A", "A"));
    }
}
