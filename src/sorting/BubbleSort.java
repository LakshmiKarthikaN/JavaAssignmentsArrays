package sorting;


import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort() {
        System.out.println("Try programiz.pro");
        int[] arr = {3, 1, 5, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void insertionSort(){
        int[] arr = {14,9,15,12,6,8,13};
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static  void selectionSort(int[] arr){
        for(int i =0;i<arr.length-1;i++) {
            int last = arr.length - 1 - i;
            System.out.println("last :" +last);
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    private static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
        System.out.println(Arrays.toString(arr));
    }
    private static int  getMaxIndex(int arr[], int start, int last){
        int max =start;
         for(int i = start;i<=last;i++){
             if(arr[max]<arr[i])
                  max = i;
             System.out.println(arr[max]);
         }

         return max;
    }
    public static void main(String[] args) {
        //BubbleSort.bubbleSort();
        //int[] arr = {4,5,1,2,3};
        //selectionSort(arr);
        insertionSort();
       // System.out.println(Arrays.toString(arr));
    }
}
