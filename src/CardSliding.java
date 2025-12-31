import java.util.HashSet;

public class CardSliding {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        int l =0;
        int r=1;
        int minlen =Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        set.add(cards[0]);
        while(r<cards.length){
            if(set.contains(cards[r])){
                set.remove(cards[l]);
                l++;
            }set.add(cards[r]);
            System.out.println(set);
            if(cards[l]==cards[r]){
                minlen = Math.min(minlen,r-l+1);
            }
            r++;
        }
        System.out.println(minlen);
    }
}
