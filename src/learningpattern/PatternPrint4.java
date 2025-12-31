package learningpattern;

public class PatternPrint4 {
    public static void main(String[] args) {
        int n = 5;

       for(int i = n;i>0;i--){
               int num = n;
           for(int j = i;j>=1;j--){
               System.out.print(num--);
           }
           System.out.println();
       }
       for(int i = 1;i<=n;i++){
           for(int s = 0;s<n-i;s++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           for(int k = i-1;k>=1;k--){
               System.out.print(k);
           }
           System.out.println();
       }
        for (int i = 1; i <= n; i++) {
            int count = 1;

            for (int col = 1; col <= n + i - 1; col++) {

                // print spaces
                if (col <= n - i) {
                    System.out.print(" ");
                }
                // increasing numbers: 1 to i
                else if (col <= n) {
                    System.out.print(count++);
                }
                // decreasing numbers: i-1 to 1
                else {
                    System.out.print(--count - 1);
                    count++;
                }
            }
            System.out.println();
        }
        int num =1;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<n;j++){
                System.out.print(num+" ");
                num++;}
            }else{
                int start = num+n-1;
                num = start+1;
                for(int j = start;j>=num-n;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
      for(int i = 0;i<2*n-1;i++){
          int level = (i<n)?i:n-(i-2);
          for(int s = 0;s<level;s++){
              System.out.print("-");
          }
          for(int j = 1;j<=2*n-(2*level)-1;j++){
              System.out.print(j);
          }
          System.out.println();
      }

        int num1 = 1;

        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            // how many numbers in this row
            int count = n - i + 1;

            // print numbers with odd jump logic
            for (int j = 1; j <= count; j++) {
                System.out.print(num1);
                num1 += 2; // jump by 2 to get 1,3,5… / 2,4,6… etc

                if (j < count) System.out.print(" ");
            }

            System.out.println();
        }


        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                int d = r + c + 1;
                int diagStart = (d * (d - 1)) / 2 + 1;
                int val = diagStart + r;

                System.out.print(val + " ");
            }
            System.out.println();
        }int N = 5;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int S = i + j;
                int totalElementsBeforeS;
                int positionInS;

                // Calculate Total Elements in Previous Diagonals
                if (S < N) {
                    // Increasing length diagonals: 1 + 2 + ... + S
                    totalElementsBeforeS = S * (S + 1) / 2;
                } else {
                    // Decreasing length diagonals
                    int totalUpToMax = N * (N + 1) / 2;
                    int currentLength = 2 * N - 1 - S;

                    // Sum of integers from 1 up to currentLength (L_S)
                    int sumOfSmallestLengths = currentLength * (currentLength + 1) / 2;

                    // Sum of the decreasing part *before* S is: (1 to N-1) - (1 to L_S)
                    int sumOfDecreasingPartBeforeS = (N * (N - 1) / 2) - sumOfSmallestLengths;

                    totalElementsBeforeS = totalUpToMax + sumOfDecreasingPartBeforeS;
                }

                // Calculate Position within the Current Diagonal
                if (S < N) {
                    // Position is simply the column index + 1
                    positionInS = j + 1;
                } else {
                    // Position is relative to the diagonal's starting column
                    int j_start = S - (N - 1);
                    positionInS = j - j_start + 1;
                }

                int value = totalElementsBeforeS + positionInS;

                System.out.printf("%3d ", value);
            }
            System.out.println();
        }


    }
}
