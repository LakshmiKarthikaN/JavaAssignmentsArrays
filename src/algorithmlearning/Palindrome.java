package algorithmlearning;

public class Palindrome {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        int count = 0;
        int count1=0;
        boolean ispalindrome = false;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                ispalindrome=true;


            }else{
                if(ispalindrome){
                    count++;
                }
                ispalindrome=false;

            }
            left++;
            right--;
        }
        if((ispalindrome == true) ||(ispalindrome == false && count==1 )){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
        String name = "alex";
        String typed ="aaleex";
        int[] freq = new int[26];
        for(char c : name.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : typed.toCharArray()){
            if(freq[c-'a']>=1){
                freq[c-'a'] = -1;
            }
        }
        int count=0;
        for(int i = 0;i<26;i++){
            if(freq[i]==-1){
                count++;
            }
        }
        if(count ==name.length()){
            System.out.println("true");
        }else{
        System.out.println("false");}
    }
}
