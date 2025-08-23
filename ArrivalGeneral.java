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
        if(soldiers[i]>maxHeight){
            maxHeight=soldiers[i];
            maxIndex=i; // the index which was not known <-1> is now turned to index 0 for max
        }
      }
      for(int i=0;i<n;i++){
        if(soldiers[i]<minHeight){
            minHeight=soldiers[i];
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