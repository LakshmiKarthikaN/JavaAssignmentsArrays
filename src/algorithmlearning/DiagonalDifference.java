package algorithmlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum = 0;
        int sum1 = 0;
        int index1=0;
        int index2=arr.size()-1;
        for(int i = 0;i < arr.size();i++){
            for(int j = arr.size()-1;j>=0;j--){

                if(i==j){
                    sum1+=arr.get(i).get(j);
                }

            }
            sum+=arr.get(index1).get(index2);
            index1++;
            index2--;

        }System.out.println(sum + " "+sum1);
        return Math.abs(sum-sum1);
    }


    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));
        System.out.println(  diagonalDifference(matrix));
    }
}
