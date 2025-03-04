import java.util.Arrays;
import java.util.*;
public class TransposeMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows And Columns");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        System.out.println("Enter the Elements:");
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }System.out.println("Original Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }System.out.println("Transpose Matrix:");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        }
    }
}