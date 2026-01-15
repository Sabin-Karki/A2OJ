import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of cupboards in kitchen

        int leftOpen = 0;
        int leftClose = 0;
        int rightOpen = 0;
        int rightClose = 0;
        for (int i = 0; i < n; i++) {

            int leftSide = scanner.nextInt();
            int rightSide = scanner.nextInt();

            // leftside grabs say 1 ,0,0
            // rightside grabs say 1,1,0

            // lets focus on what to do left side first
            if (leftSide == 1) {
                leftOpen++;
            } else {
                leftClose++;
            }

            if (rightSide == 1) {
                rightOpen++;
            } else {
                rightClose++;
            }
        }

        int totalTime = 0; // time taken to flip

        // 1 0 1 1
        totalTime += Math.min(leftOpen, leftClose);
        totalTime += Math.min(rightOpen, rightClose);
        System.out.println(totalTime);
        scanner.close();
    }
}