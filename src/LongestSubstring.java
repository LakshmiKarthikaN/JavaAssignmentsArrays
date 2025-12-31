import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="caadbzabca";
        int maxlen = 0;
//        for(int i =0;i<s.length();i++){
//            int[] hash = new int[256];
//            for(int j =i;j<s.length();j++){
//                if(hash[s.charAt(j)]==1) {
//                    break;
//                }
//                hash[s.charAt(j)]=1;
//                maxlen = Math.max(maxlen,j-i+1);
//                System.out.println("s in j:"+s.charAt(j));
//                System.out.println("s in i:" +s.charAt(i));
//            }
//        }
//        System.out.println(maxlen);
//        int l =0; int r=0;
//        int[] hash = new int[256];
//        for(int i =0;i<256;i++){
//            hash[i]=-1;
//        }
//        while(r < s.length()){
//            if(hash[s.charAt(r)]!=-1){
//                if(hash[s.charAt(r)]>=l){
//                    l=hash[s.charAt(r)]+1;
//                }
//            }
//            maxlen =Math.max(maxlen,r-l+1);
//            hash[s.charAt(r)]=r;
//            r++;
//        }System.out.println(maxlen);
        HashSet<Character> set = new HashSet<>();
      int right=0;
      int left =0;
      int maxLen=0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
                System.out.println(set);
            }
            set.add(ch);
            System.out.println(set);

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        System.out.println("Length of longest unique substring: " + maxLen);


    }
}
