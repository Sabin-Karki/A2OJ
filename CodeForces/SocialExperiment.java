import java.util.Scanner;
// n people invovled,2-3 people team can be formed from n people,each team chooses one of two civ to participate in experiment
public class SocialExperiment{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int testCase = scanner.nextInt();
       while(testCase-- > 0){
          int n = scanner.nextInt();//n people
          int minimumDifference=0;
          //okay..so i have fully grasped the problem...now how can i approach is..n has say 5..now my first task is to distribute it 3.2 ..so the problem is sometime n could be 12...and it would need 4 team of 3 so 4 variable...sometime it maybe 5 so i need 2 variable to store 3n and 2n.......did tinkering in graph and found out if n is even md is 0 and if n is odd md is 1
          if(n%2==0){
           minimumDifference=0;
          }else if(n%2!=0){
            minimumDifference=1;
        }        
    
    System.out.println(minimumDifference);
    }
    scanner.close();
    }
}