import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear{


        static boolean hasUniqueDigits(int year){
            String yearString = Integer.toString(year);
            HashSet<Character> uniqueDigits = new HashSet<>();
            for(int i = 0 ; i<yearString.length();i++){
                char yearDigits = yearString.charAt(i);
                uniqueDigits.add(yearDigits); //adding digits in the set now 

            }
            return yearString.length()==uniqueDigits.size();
            }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int candidateYear = year+1; //since the candidate year is suppose to be larger than y and the minimum year too

        while(true){

            boolean isBeautiful = hasUniqueDigits(candidateYear);
            if(isBeautiful){
                System.out.println(candidateYear);
                break;
            }else{
                candidateYear++;
            }
        }
       scanner.close();
    }


        
    }
