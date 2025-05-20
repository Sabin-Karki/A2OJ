import java.util.Scanner;

public class WordCapitalization{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
       StringBuilder sb =  new StringBuilder();
            char firstIndex = inputString.charAt(0);
           if(Character.isLowerCase(firstIndex)){
            char capitalizedIndex = Character.toUpperCase(firstIndex);
            
        
           
           sb.append(capitalizedIndex);
           sb.append(inputString.substring(1)); // this returns the original string from index 1 as in will exclude the frist index now
           System.out.println(sb.toString());
           }
           else{
            System.out.println(inputString);
           }
        scanner.close();
    }
}