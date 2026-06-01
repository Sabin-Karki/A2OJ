import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke24{
    public static void main(String[] args){
        //basically 3 string and the 3rd string is suppose to contain all the letters of the first 2
        //like, 1=helloo 2=worldi 3=helloworldi = yes
        // what i can do ,well first ask to input 3 string ,and compare the 3rd string with first 2 string,but how,loop through first string and check if each char is in 3rd stirng and 
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        //the length of s1+s2 string should also be equal to s3 hmm 
        //i can combine s1 and s1 to be final string and sort s3 and s1 using array method and it sorts accordingly to ascii code hmm
        String finalString = s1 + s2;
        char[] a = finalString.toCharArray(); // this will convert string into char and store in an array like abc = ['a','b' ]etc/
        char[] b = s3.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
       
        scanner.close();
    }
}