public class SpecialMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,0,0},
                     {0,1,0},
                      {0,0,1}};
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    if((i>0 && mat[i-1][j]==0) && (j>0 && mat[i][j-1]==0)){
                        count++;
                    }
                }
            }
        }System.out.println(count);
    }
}
