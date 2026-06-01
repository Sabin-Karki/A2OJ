import java.util.Scanner;

public class HQNine25 {
    public static void main(String[] args) {
        //H= Hello, World Q=source code 9= prints lyrics + = increment value
        // this is a mock programming code and i need to print YES if the input include character which could print an output and NO if it doesn;t
        // like input= Hi! output=YES because it has H which will print the outout Hello, World
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); 
        //i can just use .contains method but i want to check if there is something faster and not hard coded than it , i can 
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='H'||c=='Q'||c=='9'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        scanner.close();
    }
    
}