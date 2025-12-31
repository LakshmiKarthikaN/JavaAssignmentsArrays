package learningpattern;

public class TriangleRight {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i =0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<=i;j++){
                    System.out.print(num + " ");
                    num++;
                }
            }else{
                int start = num+i;
                 num = start+1;
                 for(int j = start; j>=num-(i+1);j--){
                     System.out.print(j+" ");
                 }

            }
            System.out.println();
        }
        int num2 = 1;
        for(int i = 0;i<n;i++){
            for(int s = 0;s<n-i-1;s++){
                System.out.print(" ");
            }
            int start = num2+i;
             num2 = start+1;
            for(int j = start;j>=num2-(i+1);j--){
                System.out.print(j);
            }
            System.out.println();
        }
        int num3 = 1;
        for(int i = 0;i<n;i++){
            for(int s = 0;s<n-i-1;s++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print(num3+" ");
                num3++;
            }
            System.out.println();
        }
        System.out.println("=========================");
        int num4 = 1;
        for (int i = n; i >=0; i--) {
            for (int s = 0; s < n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(num4 + "  ");
                num4++;
            }
            System.out.println();
        }
//        for(int i = n;i>=0;i--){
//            for(int s= 0;s<n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0;i<n;i++){
//            for(int s= 0;s<n-i-1;s++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<=2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 0;i<2*n-1;i++){
            int l = (i<n)?i:2*n-2-i;
            for(int j = 0;j<l;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-l)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int num5 =1;
        for(int i = 0;i<2*n-1;i++){
            int level= (i<n)?i:2*5-i-2;
            for(int s=0;s<level;s++){
                System.out.print(" ");
            }
            for(int j =0;j<2*(n-level)-1;j++){
                System.out.print(num5+" ");
                num5++;
            }
            System.out.println();

        }

    }

}
