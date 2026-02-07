import java.util.Scanner;

public class PanoraPrediction{
    public static void main(String[] args) {
        // so i am suppose to enter integers, x and y...and if the y after x is prime number  ,it will have to be greater than x ...cause that is how prime number act i think....like 2  3 5 ...like the following prime numbers in sequence are in ascending order....i believe....so if that follows,print yes else print no
        // i enter 2 and 3,it prints yes..how it would achieve this,maybe convert integer to char,then check if i+1 is prime and greater than i-1...,..or if this might not work,then i can use loop to check...
        Scanner scanner = new Scanner(System.in);
        int x =  scanner.nextInt();// first integer
      int y =  scanner.nextInt(); // second integer
      int candidateNextPrime = x +1;
       while(!isPrime(candidateNextPrime)){
        candidateNextPrime++;
       }
       int isActualNextPrime  = candidateNextPrime;
            if(y==isActualNextPrime ){
                System.out.println("YES");;
            }else{
                System.out.println("NO");
            }
        }
    
    public static boolean isPrime(int number){
        if(number <=1){
            return false; 

        }if(number==2){
            return true;

        }if(number%2==0){
            return false;
        }
        if(number>2){
            for(int i=3;i*i<=number;i+=2){
            if(number%i==0){
                return false;
                
            }
        }
        }
        return true;
    
}

}

