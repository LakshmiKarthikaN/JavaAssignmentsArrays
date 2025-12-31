package algorithmlearning;

public class LongestSubstringAtLeastK {

        public static int longestSubstring(String s, int k) {
            int maxLen = 0;

            for (int target = 1; target <= 26; target++) {
                int[] freq = new int[26];
                int l = 0, r = 0;
                int unique = 0;
                int countAtLeastK = 0;

                while (r < s.length()) {
                    // expand window
                    int idx = s.charAt(r) - 'a';
                    if (freq[idx] == 0) unique++;
                    freq[idx]++;
                    if (freq[idx] == k) countAtLeastK++;
                    r++;

                    // shrink window
                    while (unique > target) {
                        int leftIdx = s.charAt(l) - 'a';
                        if (freq[leftIdx] == k) countAtLeastK--;
                        freq[leftIdx]--;
                        if (freq[leftIdx] == 0) unique--;
                        l++;
                    }

                    // valid window
                    if (unique == target && unique == countAtLeastK) {
                        maxLen = Math.max(maxLen, r - l);
                    }
                }
            }

            return maxLen;
        }

    public static void main(String[] args) {
        String s= "aaabb";
        int k = 3;
        System.out.println(longestSubstring(s,k));
    }
    }


