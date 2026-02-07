import java.util.Scanner;

public class PerfectPermutation{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt(); // size of the permutation
        //if a perfect permutation of n doesnt exist print -1.
        if(n%2!=0){
            System.out.println(-1);

        }else{
            //when size of permutaiton is evenp,perfect permutation is possible
         
            for(int i=1;i<=n;i+=2){
                System.out.print((i+1) + " " + i + " ");
            }
        }
    }
}