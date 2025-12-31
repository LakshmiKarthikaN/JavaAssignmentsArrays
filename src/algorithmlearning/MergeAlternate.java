package algorithmlearning;

public class MergeAlternate {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        while(l<Math.max(word1.length(),word2.length()) && r<Math.max(word1.length(),word2.length())){

            if(l+1==word1.length()+1 && word1.length()<word2.length()){
                sb.append(word2.charAt(r));
                r++;
            }
            else if(r+1==word2.length()+1 && word1.length()>word2.length()){
                sb.append(word1.charAt(l));
                l++;
            }
            else{
                sb.append(word1.charAt(l));
                sb.append(word2.charAt(r));
                l++;
                r++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1="ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
}
