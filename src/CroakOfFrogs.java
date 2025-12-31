public class CroakOfFrogs{
    public static  int minNumberOfFrogs(String croakOfFrogs) {
        int[] count = new int[5];
        int frogs = 0;
        int maxFrogs = 0;

        for (char ch : croakOfFrogs.toCharArray()) {
            int index = "croak".indexOf(ch);
            count[index]++;
            if (index > 0) {
                if (count[index - 1] == 0) return -1;
                count[index - 1]--;
            }
            if (index == 0)
                frogs++;
            if (index == 4)
                frogs--;
            maxFrogs = Math.max(maxFrogs, frogs);
        }
        for (int i = 0; i < 4; i++){
            if (count[i] != 0)
                return -1;
        }
        return maxFrogs;
    }

    public static void main(String[] args) {
        String croakOfFrogs="croakcroak";
        System.out.println(CroakOfFrogs.minNumberOfFrogs(croakOfFrogs));
    }
}
