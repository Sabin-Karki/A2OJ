import java.util.Scanner;

public class Insomnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 5 input has to be there seperate line
        int k = scanner.nextInt();// dragon hit with pan
        int l = scanner.nextInt();// dragon whose tail shut
        int m = scanner.nextInt();// dragon paws trampled
        int n = scanner.nextInt();// dragon who got threatned
        int d = scanner.nextInt();// total dragon counted by girl who cant sleep

        int damagedDragons = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                damagedDragons++;
            }
        }
        System.out.println(damagedDragons);
    }
}
