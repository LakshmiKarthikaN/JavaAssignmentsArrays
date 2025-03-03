import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int N = scanner.nextInt();
        
        int[][] matrix = new int[N][N]; 
        int num = 1; 

        int top = 0, bottom = N - 1, left = 0, right = N - 1;

        while (num <= N * N) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; 
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; 
            if (top <= bottom) { 
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--; 
            }
            if (left <= right) { 
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++; 
            }
        }
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
