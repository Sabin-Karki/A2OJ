package CodeForces;

import java.util.Scanner;

//input test case first
//user inputs a string with 4 characters <integers>which are years and combination of them into 2 each A and B and we need a to output such A and B if (A+B)^2 is equal to the concatenation of A and B
//  0 1 2 3 

public class SquareYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases-- >0 ){
            String year = scanner.next();
            int A = Integer.parseInt(year.substring(0, 2));
            int B=Integer.parseInt(year.substring(2,4));
            int sum = A + B;
            if (sum * sum == Integer.parseInt(year)){
                System.out.println(A + " " +  B);  // just concantenate bruh..
            }else{
                System.out.println(-1);
            }
        }
    }
}