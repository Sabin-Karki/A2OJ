package CodeForces;
import java.util.Scanner;

public class Gellyflower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int a = sc.nextInt();  // Gellyfish HP
            int b = sc.nextInt();  // Flower HP
            int c = sc.nextInt();  // Gellyfish knight HP
            int d = sc.nextInt();  // Flower knight HP

            if (c >= d && a>=d) {
                System.out.println("Gellyfish"); 
            } else {
                System.out.println("Flower");
            }
        }
        sc.close();
    }
}