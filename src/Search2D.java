public class Search2D {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},
                {10,11,13,15},{20,24,26,29},{30,40,50,60}
          };
        int target=3;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=rows * cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid / cols;
            int col= mid%cols;
            if(matrix[row][col]==target){
                 System.out.println(true);
            }if(matrix[row][col]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }System.out.println(false);
    }
}
