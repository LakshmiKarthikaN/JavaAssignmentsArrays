package learningpattern;

public class Right {
    public static void main(String[] args) {
        int n = 5;
        int num = 0;
        for(int i =0;i<n;i++){
            for(int s = 0; s<n-i+1;s++){
                System.out.printf("%3s","-");
            }
            for(int j = 0;j<= i;j++){
                num++;
                System.out.printf("%3d",num);
            }
            System.out.println();
        }
        int num1 = 1;
        for(int i = 0;i<n;i++){
            int start = num1+i;
            num1 = start+1;
            for(int s = 1;s<n-i+1;s++){
                System.out.printf("%3s","-");
            }
            for(int v = start;v>=num1-(i+1);v--){
                System.out.printf("%3d",v);
            }
            System.out.println();
        }
        int num2=1;
        for(int i = 0;i<n ;i++){
            for(int s = 0;s<i;s++){
                System.out.printf("%3s"," ");
            }
            for(int j = 0;j<n-i;j++){

                System.out.printf("%3d",num2);
                num2++;
            }
            System.out.println();
        }
        int num3 = 1;
        int c =6;
        for(int i =0;i<n;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {

                    System.out.print(num3+" ");
                    ++num3;
                }
            } else {
//                int start = num3  + 2;
//                num3 = start + 1;
//                for (int v = start; v >= num3 - 3; v--) {
//                    System.out.print(v+" ");
//                }
                int start = (num3-1)  + c;
                num3 = start + 1;
                for (int v = start; v >= num3 - c; v--) {
                    System.out.print(v+" ");
                }
//                for(int j = 2;j>=0;j--){
//                    System.out.print(num3+" ");
//                    num3++;
//                }
            }
            System.out.println();
        }
        int num4=1;
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(num4+" ");
                num4++;
            }
            System.out.println();
        }
        int num5 = 1;
        for(int i = 0;i<n;i++){
            for(int s = 0;s<n-i-1;s++){
                System.out.printf("%3s"," ");
            }
            int start = num5+i;
           num5=start+1;
        for(int j = start;j>=num5-(i+1);j--){
            System.out.printf("%3d",j);
        }
            System.out.println();
        }
        int num6=1;
        for(int i = 0;i<n;i++){
            for(int s = 0;s<n-i-1;s++){
                System.out.print("-");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print(num6+" ");
                num6+=2;
            }
            System.out.println();
        }

    }

}