public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{7,3,1,9},
                     {3,4,6,9},
                     {6,9,6,6},
                     {9,5,8,5}
        };
        int sum=0;
        if(mat.length%2==0){
            for(int i = 0;i<mat.length;i++){
                for(int j = 0;j < mat[i].length;j++){
                    if(i==j){
                        sum+=mat[i][j];
                    }System.out.println(sum);
                }
            }int row=0;
            int col=mat.length-1;
            for(int i = 0;i <= mat.length;i++){
//                if(row==col){
//                    sum=sum-mat[row][col];
//                }
                     sum += mat[row++][col--];
                System.out.println(sum);
            }System.out.println(sum);
        }
//
    }
}
