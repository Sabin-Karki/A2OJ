import java.util.Scanner;

public class ActualWords{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
 
        // if a words contain an equal uppercase and lowercase...replace all with lowercase
        //if a s has more uppercase than lower than replace all with upper
        int upperCaseLetter = 0;
        int lowerCaseletter = 0;

        for(int i=0;i<inputString.length();i++){
            char currentChar = inputString.charAt(i);
            if(Character.isUpperCase(currentChar)){
                upperCaseLetter++;
            }else if(Character.isLowerCase(currentChar)){
                lowerCaseletter++;
            }
             
        }
        if(lowerCaseletter>=upperCaseLetter ){
            System.out.println(inputString.toLowerCase());
        }else if(upperCaseLetter>lowerCaseletter){
            System.out.println(inputString.toUpperCase());
        }
        
    }
}


//SABin is splitted into chars..and each index each character is stored in currentchar
//character method isuppercase checks the scurrent.returns true since it sees uppercase and 0 uppercase turns to 1 since i incremented