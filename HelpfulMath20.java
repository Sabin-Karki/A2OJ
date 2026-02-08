//xenia can sum only if the numbers are in non decreasing order / increasing order 
//sounds simple ...i will accept string s with the numbers,loop through string length and ignore the + character and store the first number in a variable and comapre it to current  number and if current  number > previous then it is in increasing and will continue....|| 
// something of this nature ...
//1+3+2 =this output has to be 1+2+3
//split into string of array..1 2 3 and then sorting and join

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath20{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String inputString=scanner.nextLine();
       String[] numbers=inputString.split("\\+"); //now numbers[] = {1,3,2}.i need to sort this array and join with +,i can just use .sort method and join with + 
       Arrays.sort(numbers);//now numbers[] ={1,2,3}
       String finalOutput="";
      for (int i=0;i<numbers.length;i++){
         finalOutput=String.join("+",numbers);
      }
               System.out.println(finalOutput);
               scanner.close();
        
        
    }
}