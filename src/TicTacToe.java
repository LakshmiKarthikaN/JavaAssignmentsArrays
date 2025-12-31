public class TicTacToe {
    public static void main(String[] args) {
        int[][] moves={{0,0},{2,0},{1,1},{2,1},{2,2}};
        char[][] game=new char[3][3];
        for(int i=0;i<moves.length;i++){
           int row=moves[i][0];
           int col=moves[i][1];
           if(i%2==0){
               game[row][col]='X';
           }else{
               game[row][col]='O';
           }
        }
        for(int i=0;i<game.length;i++){

           for(int j=0;j<game.length;j++){
               if(game[i][j]=='X'){
                   System.out.println("A");
               }else{
                   System.out.println("B");
               }
           }
        }
    }
}
