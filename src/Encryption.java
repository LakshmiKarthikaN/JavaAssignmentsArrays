public class Encryption {
    public static int MaxElement(int[] nums){

        int max  = 0;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }return max;
    }
    public static void main(String[] args) {
//        String s ="feedthedog";
//        int length = s.length();
//        int index = 0;
//        int rows = (int)Math.floor(Math.sqrt(length));
//        int columns = (int)Math.ceil(Math.sqrt(length));
//        System.out.println(rows);
//        System.out.println(columns);
//        char[][] mat = new char[rows][columns];
//        for(int i =0;i<rows && index < length;i++){
//            for(int j = 0;j < columns && index < length ;j++){
//                mat[i][j] = s.charAt(index++);
//                System.out.print(mat[i][j]+" ");
//            } System.out.println();
//        }StringBuilder str = new StringBuilder();
//        for(int j =0;j<columns;j++){
//            for(int i =0;i<rows;i++){
//                if(mat[i][j]!=' '){
//                   str.append(mat[i][j]);
//                }
//            }str.append(' ');
//        }System.out.println(str.toString().trim());
        int[] nums = {15};
        System.out.println(MaxElement(nums));

    }
}
