package linkedlistremove;

public class Main {
    public static void main(String[] args) {
        String s = "IceCreAm";
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (!isVowel(ch[left])) {
                left++;
                continue;
            }
            if (!isVowel(ch[right])) {
                right--;
                continue;
            }

            // Swap vowels
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(ch)); // Output: "AceCrEmI"
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
