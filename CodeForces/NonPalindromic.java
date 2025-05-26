package CodeForces;

import java.util.Scanner;

public class NonPalindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int zeroCount = 0, oneCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeroCount++;
                else oneCount++;
            }

            int minGoodPairs = Math.abs(zeroCount - oneCount) / 2;
            int maxGoodPairs = (zeroCount / 2) + (oneCount / 2);

            if (k >= minGoodPairs && k <= maxGoodPairs && ((k - minGoodPairs) % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
