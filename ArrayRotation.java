import java.util.*;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int k = scanner.nextInt();
        k = k % size;
        for (int i = 0; i < k; i++) {
            rotateRightByOne(arr);
    
            printArray(arr);
        }

        scanner.close();
    }
    public static void rotateRightByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
