import java.util.Scanner;

public class LuckyNum{
   public static void main(String[] args){
 
    // 4 and 7 are lucky digits,so a number entered will have certain lucky digits either 4 or 7..and the count of lucky digits should be 1 of the lucky number..
    Scanner scanner =  new Scanner(System.in);
    String enteredNumber =  scanner.nextLine(); //using string to loop through each character and check for 4 or 7
    int luckyDigitCount = 0;
    for(int i =0;i<enteredNumber.length();i++){
        Character Digit = enteredNumber.charAt(i);
        if(Digit=='4' || Digit=='7'){
            luckyDigitCount++;
           
        }
        }
        boolean isLuckyCount = false;
        if(luckyDigitCount==4 || luckyDigitCount==7){
          
            System.out.println("YES");
        }else{
            
            System.out.println("NO");
        }
        scanner.close();
    }
}
