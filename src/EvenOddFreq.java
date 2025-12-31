public class EvenOddFreq {
    public static void main(String[] args) {
        String s = "mmsmsym";
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        int oddmax = 0;
        int evenmin = Integer.MAX_VALUE;
        for(int i = 0;i < freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2==0){
                if(evenmin > freq[i]){
                    evenmin = freq[i];
                }
            }

            else{

                if(oddmax < freq[i]){
                    oddmax = freq[i];
                }
            }

        }
        System.out.println(evenmin);
        System.out.println(oddmax);
        System.out.println(Math.abs(evenmin - oddmax));
    }
}
