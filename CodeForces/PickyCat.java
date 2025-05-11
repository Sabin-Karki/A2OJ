package CodeForces;

import java.util.Scanner;

public class PickyCat {
    // hmm so question wants me to input first test case..then length of array the elements of that length
    // print yes if it is possible to make element at index 1 become median of array and no otherwise
    //so what really is median of array ok..if n=3 [4,5,1] sort it..[1,4,5]...do n/2 and the th term is median..so 3/2 is 1.5->rounds to 2(2nd smallest will be ).then 4 is the median...
    // you can also choose an index and multiply ai by -1 ...you can choose index to be 1 too

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            int k_needed_smaller = (n - 1) / 2;
            int abs_a0_val = Math.abs(a[0]);
            
            int count_magnitudes_less_than_abs_a0 = 0;
            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i]) < abs_a0_val) {
                    count_magnitudes_less_than_abs_a0++;
                }
            }
            
            int count_magnitudes_greater_than_abs_a0 = (n - 1) - count_magnitudes_less_than_abs_a0;

            boolean possible = false;

            
            if (count_magnitudes_less_than_abs_a0 == k_needed_smaller) {
                possible = true;
            }

            
            if (!possible) { 
                 if (count_magnitudes_greater_than_abs_a0 == k_needed_smaller) {
                    possible = true;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}