public class SortPeople {
    public static void main(String[] args) {
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        for(int i=0;i<heights.length;i++){
            for(int j = i+1;j< heights.length;j++){
                if(heights[i]<heights[j]){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }for(int i=0;i<heights.length;i++){

            System.out.print(names[i]+" ");
        }

    }
}
