import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentElement {
    // most frequent element in an array => pattern for hashmap=>frequences,count occurences.find max count
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt(); // input now will have 5 elements 1 2 3 2 1
        }
        //trying to buld a number=key and value=how many time it occurs 
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num:arr){ // num  = [ 1 2 3 2 1] ,then num=1 ,in freqeuncyMap k-v=p[1,1],num=2 , getOrDefault(2,0) returns 0 because 2 is not in map yet,so 0+1=1,so [2,1]...so what happens is when num =1 again getORDefault will return 1 ,and adding 1 becomes 2,so [1,2]=>2 times 1 occurs,so incase 1 were to repeat,the getOrDefault would return 2 and value would be 2+1; 3 .put(1,3)..
            frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1);
        }
        int maxCount=0;
        int mostFrequentElement=arr[0];
        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                mostFrequentElement=entry.getKey();
            }
        }
        System.out.println("Most frequent element: "+mostFrequentElement);
        scanner.close();
    }
    
}
