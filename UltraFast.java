import java.util.Scanner;

public class UltraFast{
    public static void main(String[] args) {
        //basically a binary addition and output is the result<ignore carry over btw>
        // 1 and 1 is 0 1 0 and 0 1 is 1 0 0 is 0
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();
        StringBuilder resultString = new StringBuilder(); ///to append the result of each addition as a whole
        int result = 0;
        for(int i = 0;i<firstNumber.length();i++) {
           char firstDigit =  firstNumber.charAt(i);
           char secondDigit = secondNumber.charAt(i);
           if(firstDigit=='1'&&secondDigit=='1'){
            result = 0;
            resultString.append(result);
           }else if(firstDigit=='0'&& secondDigit=='0'){
            result=0;
            resultString.append(result);
           }else{
            result=1;
            resultString.append(result);
           }
        } 
        
        System.out.println(resultString.toString());
        
    
}
}