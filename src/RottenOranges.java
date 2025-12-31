public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid={
                {2,1,1},
                {0,1,1},
                {1,0,1}
        };
        int count=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length-1;j++){
                if(grid[i][j]==2){
                    if(grid[i][j+1]==1){
                        grid[i][j]=2;
                    }if(grid[i+1][j]==1){
                        grid[i+1][j]=2;
                    }
                    System.out.println(grid[i][j]);
                }count++;

            }
        }for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.println(grid[i][j]);
                if(grid[i][j]==2 || grid[i][j]==0){
                    //System.out.println(count);
                }
                else{
                   // System.out.println(0);
                }
            }
        }

    }
}
