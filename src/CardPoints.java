public class CardPoints {
    public static int maxScore(int[] cardPoints, int k) {
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            leftsum += cardPoints[i];
            maxsum = leftsum;
        }
            int rightindex = cardPoints.length - 1;
            for (int j = k - 1; j >= 0; j--) {
                leftsum = leftsum - cardPoints[j];
                rightsum += cardPoints[rightindex];
                maxsum = Math.max(maxsum, leftsum + rightsum);
                rightindex = rightindex - 1;
            }


        return maxsum;

    }

    public static void main(String[] args) {
        int[] cardPoints={1,2,3,4,5,6,1};
        int k =3;
        System.out.println(maxScore(cardPoints,k));
    }
}
