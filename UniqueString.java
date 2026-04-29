import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueString {
    public static void main(String[] args){
        // need to check if string has all unique chars and print unique ones , remove duplicates,seen before,find unique=>Set,HashSet,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine(); //input now has = "hey dude"
        StringBuilder uniqueString = new StringBuilder(); //why string builder? 
        //i want to use Set to solve this
        Set<Character> seenChars=new HashSet<>();
        for(char c:input.toCharArray()){
            if(!seenChars.contains(c)){
                seenChars.add(c);
                uniqueString.append(c);
            }
        }
        //c had h e y d u d e , because i just took input hey dude to char array,it doesnt mean it had original ,now seeChar which does have unqiue chars h e y d u , now checks if  seenChars = h is not containing c=h then add h to Seechar and append h to unqiueString
        System.out.println(uniqueString.toString());
        scanner.close();
    }
    
}
