package algorithmlearning;

import java.util.Arrays;

public class PalindromicString {

        public static String firstPalindrome(String[] words) {
            boolean ispalindrome = false;
            for(String s : words){
                int left = 0;
                int right = s.length()-1;
                while(left<=right){
                    if(s.charAt(left)==s.charAt(right)){
                        ispalindrome = true;

                    }
                    else{
                        ispalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(ispalindrome){
                    return s;

                }

            } return " ";
        }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
        int[] arr= {-1,10,6,7,-7,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

