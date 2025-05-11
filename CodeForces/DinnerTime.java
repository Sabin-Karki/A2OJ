package CodeForces;

import java.util.Scanner;

public class DinnerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (n % p == 0) {
                if (m == (n / p) * q) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}