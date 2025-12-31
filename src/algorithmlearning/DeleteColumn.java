package algorithmlearning;

public class DeleteColumn {
    public static int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count= 0;
        for(int i =0;i<cols-1;i++){
            for(int j = 0;j<rows-1;j++){
                System.out.println(strs[i].charAt(j));
                System.out.println(strs[i+1].charAt(j));
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] strs = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(strs));
    }
}
