public class RansomNote {
    public static boolean magazine(String ransomeNote, String magazine) {
        int[] ransomfreq = new int[26];
        int[] magazinefreq = new int[26];
        for (char c : ransomeNote.toCharArray()) {
            ransomfreq[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            magazinefreq[c - 'a']++;
        }
        for (int i = 0; i < ransomfreq.length; i++) {
            System.out.print(magazinefreq[i] + " ");

            //System.out.print(ransomfreq[i] + " ");
        }  System.out.println();
        for (int i = 0; i < ransomfreq.length; i++) {


            System.out.print(ransomfreq[i] + " ");
        }

        for (int i = 0; i < ransomfreq.length; i++) {
            //System.out.print(ransomfreq[i] + " ");
            if(ransomfreq[i]!=0 && magazinefreq[i]!=0) {


                if (ransomfreq[i] <= magazinefreq[i]) {
                    return true;
                }
            }

        }return false;


    }



    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        System.out.println(RansomNote.magazine(ransomNote,magazine));

    }
}