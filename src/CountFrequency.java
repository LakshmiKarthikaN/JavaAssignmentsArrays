public class CountFrequency {
    static boolean checkfrequency(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length();i++){
            freq[s.charAt(i)-'a']++;
        }int expected = 0;
        for(int f : freq){
            if(f!=0){
                if(expected ==0)
                    expected =f;
                else if(expected!=f)
                    return false;
            }

        }return true;
    }
    public static void main(String[] args) {
        String s = "tveixwaeoezcf";
        System.out.println(checkfrequency(s));
    }
}
