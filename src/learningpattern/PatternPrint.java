package learningpattern;

import java.util.Scanner;

public class PatternPrint {
    private static void numberPattern(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    private static void numberingPatter(int n){
        int n1 = 0;
        for(int i=0;i<n;i++){
            //int n1 = 0;
            for(int j =0; j<=i;j++){
                n1++;
                System.out.print(n1+" ");
            }
            System.out.println();
        }
    }
    private static void rightTriangle(int n){
        int num = 0;
        for(int i = 0;i<n;i++){

           for(int s = 0;s<n-i-1;s++){
               System.out.printf("%3s", "");
           }
           for(int j =0;j<=i;j++ ){
               num++;
               System.out.printf("%3d", num);
           }
            System.out.println();
        }
    }
    private static void TriangleNumbering(int n){
        int num = 1;
        for(int i = 0;i<n;i++){
            int start = num+i;
            num = start+1;
            for(int s = 1;s<n-i+1;s++){
                System.out.printf("%3s"," ");
            }
            for(int v = start;v>=num-(i+1);v--){
                System.out.printf("%3d",v);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberPattern(n);
        numberingPatter(n);
        rightTriangle(n);
        TriangleNumbering(n);
    }
}
