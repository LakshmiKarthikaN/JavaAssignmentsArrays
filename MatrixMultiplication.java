import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for first matrix (rows of second matrix): ");
        int colsA = scanner.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int colsB = scanner.nextInt();
		int[][] A = new int[rowsA][colsA];
        int[][] B = new int[colsA][colsB];
        int[][] result = new int[rowsA][colsB]; 
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < colsA; i++) { 
            for (int j = 0; j < colsB; j++){
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rowsA; i++) { 
            for (int j = 0; j < colsB; j++) { 
                result[i][j] = 0; 
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
