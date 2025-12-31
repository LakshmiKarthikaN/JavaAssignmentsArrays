import java.util.Scanner;

public class JaggedArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of people (N): ");
        int N = scanner.nextInt();
		int[][] weights = new int[N][];
		for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weight records for person " + (i + 1) + ": ");
            int count = scanner.nextInt();
            weights[i] = new int[count];

            System.out.println("Enter weights for person " + (i + 1) + ": ");
            for (int j = 0; j < count; j++) {
                weights[i][j] = scanner.nextInt();
            }
        }System.out.println("\nCurrent Weight Records:");
        for (int i = 0; i < N; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            for (int j = 0; j < weights[i].length; j++) {
                System.out.print(weights[i][j] + " ");
            }
            System.out.println();
        } System.out.print("\nEnter person index (1 to N) to add a weight: ");
        int personIndex = scanner.nextInt() - 1;
        System.out.print("Enter new weight value: ");
        int newWeight = scanner.nextInt();

        int[] newWeights = new int[weights[personIndex].length + 1];
        for (int j = 0; j < weights[personIndex].length; j++) {
            newWeights[j] = weights[personIndex][j];
        }
        newWeights[newWeights.length - 1] = newWeight;
        weights[personIndex] = newWeights;

        System.out.println("Updated Weight Records:");
        for (int i = 0; i < N; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            for (int j = 0; j < weights[i].length; j++) {
                System.out.print(weights[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter person index minimum weight: ");
        int minPerson = scanner.nextInt() - 1;
        int minWeight = weights[minPerson][0];

        for (int j = 1; j < weights[minPerson].length; j++) {
            if (weights[minPerson][j] < minWeight) {
                minWeight = weights[minPerson][j];
            }
        }

        System.out.println("Minimum weight of person " + (minPerson + 1) + " is: " + minWeight);

        scanner.close();
    }
}
