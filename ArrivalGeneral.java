import java.util.Scanner;

public class ArrivalGeneral { 
     // first and last should be maximum and minimum respectively
     //output is to find the time taken to reach the destinatino
     // 1<a<100 acording to question
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of soldiers;
        int[] soldiers = new int[n];//array to store soldier of size n
        for(int i=0;i<n;i++){
            soldiers[i] = scanner.nextInt();
        }
        int maxHeight = -1;
        int minHeight = 101;
        int maxIndex = -1;
        int minIndex = -1;
        
      for ( int i=0;i<n;i++){
        //get the leftmost maximum and last minimum
      int currentHeight = soldiers[i];
      if(currentHeight>maxHeight){
        maxHeight=currentHeight;
        maxIndex=i;
      }
      if(currentHeight<=minHeight){
        minHeight=currentHeight;
        minIndex=i;
      }
      }
      int moves = maxIndex +(n-1-minIndex);
      if(maxIndex>minIndex){
        moves--;
       
      }
               System.out.println(moves);
     }
}