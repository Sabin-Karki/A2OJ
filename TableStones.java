import java.util.Scanner;

public class TableStones{
    public static void main(String[] args) {
        //read number of stones first
        Scanner scanner = new Scanner(System.in);
       int numberStone = scanner.nextInt();
        String colorOfStone =  scanner.next();
        int stonesToRemove = 0;
      for(int i =1;i<colorOfStone.length();i++){
        char currentstonecolor = colorOfStone.charAt(i);
        if(currentstonecolor==colorOfStone.charAt(i-1)){
          stonesToRemove++;
        }

      }
      System.out.println(stonesToRemove);
      scanner.close();
    }
}