package CodeForces;
import java.util.Scanner;

public class FashionableArray{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int testCases = scanner.nextInt(); // reads the test cases ,system reads test case written by user in terminal
         while(testCases-- > 0){
            int n = scanner.nextInt();//reads size of array
            int[] inputArray =  new int[n];//intializing array of size n
            for(int k=0;k<inputArray.length;k++){ // Changed loop variable to k to avoid conflict if i was used inside
                inputArray[k] = scanner.nextInt(); // this is for entering elements of array of size n
            }

           if(n==1){
                System.out.println("0");
                continue;
            }

            int currentMin = inputArray[0];
            int currentMax = inputArray[0];
            for(int k=1;k<n;k++){
                if(inputArray[k] < currentMin){
                    currentMin = inputArray[k];
                }
                if(inputArray[k] > currentMax){
                    currentMax = inputArray[k];
                }
            }
            
            //learnt the parity has to be same for fashionable to be possible
            if((currentMax%2)==(currentMin%2)){
                System.out.println(0); //  the parity will be either have to be both even or both odd ...
                continue; 
            }else{
                int minOperations = n-1; // this is what i will have to do to make fashinable u know..remove 1 elmenent basicallty decrease size by 1
                
                for(int i=0;i<n;i++){
                    for(int j = 0;j<n;j++){
                        int pairMax = Math.max(inputArray[i],inputArray[j]); // Using a different name for clarity from currentMax
                        int pairMin =  Math.min(inputArray[i], inputArray[j]); // Using a different name for clarity from currentMin

                        if((pairMax%2)==(pairMin%2)){
                            int currentRemovals=0;
                            for(int k=0;k<n;k++){
                                int elementOriginal=inputArray[k];
                                if(elementOriginal<pairMin||elementOriginal>pairMax){
                                    currentRemovals++;
                                }
                            }
                            minOperations=Math.min(minOperations, currentRemovals);
                        }
                    }
                }
                System.out.println(minOperations);
            }
         }
         scanner.close();
    }
}