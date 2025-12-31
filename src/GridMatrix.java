public class GridMatrix {
    public static void main(String[] args) {
        int[][] grid={{1}};
        System.out.println(grid.length);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if((i+1 < grid.length && j+1<grid.length) && (grid[i][j]==grid[i+1][j] && grid[i][j]==grid[i][j+1])){
                    System.out.println(true);
                }else{
                     System.out.println(false);
                }
            }
        }
    }
}
