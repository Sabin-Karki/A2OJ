import java.util.Scanner;

public class LawnMower{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases-- > 0){
            long n = scanner.nextLong(); //no of board
            long w = scanner.nextLong(); //width of lawnmower 
            //to find maximum number of board that can be removed from fence
            long keptBoards = n/w; // the board which stands up after consecutive w-1 boards are removed 
            long maxBoardToRemove = n - keptBoards;
            System.out.println(maxBoardToRemove);

        }
    }
}