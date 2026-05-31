import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOG23{
    public static void main(String[] args) {
        //female = otherwise female , CHAT WITH HER!
        //male= if number of distinct character in username is odd,IGNORE HIM!

        // quite simple ,need original characters with no duplicate basically using hashset and then return size and check if its even odd 
        Scanner scanner = new Scanner(System.in);
        String username= scanner.next();
        Set<Character> distinctChar = new HashSet<>();
        for(int i=0;i<username.length();i++){
            distinctChar.add(username.charAt(i)); // the hashset will now have say kevin = > k e v i n, and if it had kevinn it will still have just kevin,now read the size of hashset and check if even or odd
        }
        if(distinctChar.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        scanner.close();
    }
}