//amazing is counted when score of contest is strcitly higher than all previous score or lower than all previous score
//need to count how many such "amazing " performance have been

import java.util.Scanner;

public class BestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// no of coding contest
        int bestScoreSoFar = scanner.nextInt();// first score
        int worstScoreSoFar = bestScoreSoFar;
        int amazingCount = 0;
        for (int i = 1; i < n; i++) {
            int currentScore = scanner.nextInt();
            if (currentScore > bestScoreSoFar) {
                amazingCount++;
                bestScoreSoFar = currentScore;
            } else if (currentScore < worstScoreSoFar) {
                amazingCount++;
                worstScoreSoFar = currentScore;
            }
        }
        System.out.println(amazingCount);
        scanner.close();

    }
}