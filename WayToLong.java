import java.util.Scanner;

public class WayToLong {
    public static void main(String[] args) {
        //so the problem is to read a string and if the length of the string i greater than 10 ,print the first char and last char and the number of character between 1st and last
        //okay ,so input is a string , check .length of string if > 10, print first chat with .chatAt(0) and last char with if length is 11 , last char is .charAt(length-1) because .charAt uses zero based indexing so i cant put just length there, ok now the goal is to count the number of character between them and printing that number in between 1st and last word
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            String word = scanner.next();
            if(word.length()>10){
                Character first =word.charAt(0);
                Character last = word.charAt(word.length()-1);
                //by now say for localization first = l last = n ,my thing is if i do word.length()-2,it wil give me o though ? not everything between l and n ? like i think if i go String inBetween = word.subString actually becuase in my understanding .length()-2 will only give the character o not ocalizati ? wait i clocked it ,is the  -2 because we are not counting 1st and last word which is 2 ? this makes sense and is evene easier than substring
                //1st approach with substring
                // String inBetween = word.substring(first+1,last); // -1 is not needed because substring trims the last index 
                // System.out.println(first+""+inBetween.length()+""+last);

                //2nd approach cause i think mixing character object with string is causing precondition error

                 System.out.println(first.toString()+""+(word.length()-2)+""+last.toString());
            }else{
                System.out.println(word);
            }
        }
        scanner.close();

    }
    
}
