public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }

            }
        }for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                System.out.print(image[i][j]+" ");
            }
        }
    }

}
