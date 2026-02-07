import java.util.Scanner;

public class Borze {
public static void main(String[] args) {
    // 0 as . 1 as -. 2 as --

    Scanner scanner= new Scanner(System.in);  
    String borzeString = scanner.nextLine(); // just normal reading the input and storing in borzestring
    StringBuilder decodedString =  new StringBuilder(); // using String builder as it is mutable and also can use append method
   
    for(int i=0;i<borzeString.length();i++){
        char currentIndex = borzeString.charAt(i); //instead of whole input..i need to get current position of string nd store it in curretnIndex
        if(currentIndex == '.'){
            decodedString.append(0);
        }else if(currentIndex == '-'){
            char nextIndex = borzeString.charAt(i+1);
            if(nextIndex == '.'){
                decodedString.append(1);
                i++;
            }else if(nextIndex == '-'){
                decodedString.append(2);
                i++;
            }
        }

    }
    System.out.println(decodedString.toString());
    scanner.close();
}    
    
}
