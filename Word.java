import java.util.Scanner;

public class Word{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultString = scanner.nextLine();
        StringBuilder resultSemiOutput = new StringBuilder(); // sb is mutable and it allows to append to existing string and holds new characters without making new object
        for(int i=0;i<resultString.length();i++){
               char currentChar = resultString.charAt(i);
              if(Character.isUpperCase(currentChar)){   
                currentChar = Character.toLowerCase(currentChar);
              }else if(Character.isLowerCase(currentChar)){
                  currentChar = Character.toUpperCase(currentChar);
              }
              resultSemiOutput.append(currentChar);
        }
        resultString=resultSemiOutput.toString();
        System.out.println(resultString);
    }
}