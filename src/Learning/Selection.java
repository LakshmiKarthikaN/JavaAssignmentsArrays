package Learning;

import java.util.Arrays;

public class Selection {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            int[] arr = {-90,89,1,2};

            for (int i = 0; i < arr.length; i++) {
                int last = arr.length-1-i;
                int max = 0;

                for (int j = 0; j <= last; j++) {
                    if (arr[max] < arr[j]) {
                        max = j;

                    }
                    System.out.println("max :" + arr[max]);
                }
                    int temp = arr[max];
                    System.out.println("temp :" + temp);
                    arr[max] = arr[last];
                    System.out.println("max:" + arr[max]);

                    arr[last] = temp;
                    System.out.println("arr[i] : " + arr[i]);
                    System.out.println(Arrays.toString(arr));

            }
            System.out.println(Arrays.toString(arr));
        }

}
