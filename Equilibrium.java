package A20J;

import java.util.Scanner;

//if total netforces is 0 then it is an equilibrium
// so lets say why we are doing sumfx += fx,is basically,sumfx is total sum of component of fx

public class Equilibrium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        int sumfx = 0;
        int Sumfy=0;
        int Sumfz=0;
      
        for(int i=0;i<n;i++){
      int fx =scanner.nextInt();
      int fy=scanner.nextInt();
      int fz=scanner.nextInt();

      sumfx += fx;
      Sumfy +=fy;
     Sumfz +=fz;
   }
        if(sumfx==0&&Sumfy==0&&Sumfz==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        scanner.close();
    }
}
