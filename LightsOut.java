import java.util.Scanner;

public class LightsOut{                                                 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=3;
        int[][] numPresses= new int[n][n];
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               numPresses[i][j]=scanner.nextInt();
                                 
            }
           }
           //output of the final light state:
           int[][] Lights =  new int[n][n];
  
           //let me give directions for the adjecent sides first
           int[] dx = {-1,1,0,0}; //change in direction of rows (up down left right)
           int[]  dy = {0,0,-1,1}; //change in direction of same column  (either goes left or right)
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 int toggleCount = numPresses[i][j];

                 for(int d=0;d<4;d++){ // d represents all 4 direction which affects adjacent sides...
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if(ni>=0 && ni<n && nj>=0 && nj<n){
                       toggleCount = toggleCount + numPresses[ni][nj];
                    }
                 }
                  if(toggleCount%2 == 0){
                   Lights[i][j] = 1;
                  }else{
                    Lights[i][j]=0;
                  }

            }
           }
           //pritning final light state
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Lights[i][j]);  //using print to stay on same line
            }
            System.out.println();
           }
           scanner.close();
    }
}
