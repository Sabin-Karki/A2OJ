//case is irrelevant , if 1st is lower than 2nd print -1 , if they are equal print 0 ,if second is lower than 1st print 1

import java.util.Scanner;

public class LexiOrder {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String s1= scanner.next();
        String s2 = scanner.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.compareTo(s2)<0){
            System.out.println(-1);
        }else if(s1.compareTo(s2)==0){
            System.out.println(0);
        }else{
            System.out.println(1); // s1.compareTo(s2)>0 , meaning s1 is > s2
        }
    
        scanner.close();
    }
}