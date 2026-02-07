//need to find volume of oj from n drinks in fridge where lot of orange juice are there
//volume fraction = volume component/total volume

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // gets total number of drinks in fridge
        int originalN = n;
        double totalPercentageSum = 0;
        while (n > 0) {
            int p = scanner.nextInt();
            totalPercentageSum += p;
            n--;

        }
        // sum of percentage / orginal volume
        double result = totalPercentageSum / originalN;
        System.out.println(result);
        scanner.close();
    }
}
