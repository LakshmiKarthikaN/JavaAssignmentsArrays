public class SetMatrix {
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        matrix[i][k]=-18;
                    }
                    for(int l=0;l<matrix.length;l++){
                        matrix[l][j]=-18;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-18){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
