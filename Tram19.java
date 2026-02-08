//calculate minimum capacity such that number of people inside tram at any time does not exceed it 
//passenger exit the tram at stop before any passenger enter.and at last stop all passengers exit the tram
//minimum capacity = the number of passengers inside the tram at any time must not exceed it



import java.util.Scanner;

public class Tram19{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt(); //number of tram stops 
        int currentPassengers = 0; //tram will have 0 passengers at the start of journey 
        int minimumCapacity = 0 ; //the rule is number of current passengers inside the tram at each stop must not exceed the this value
        for(int i=1;i<=n;i++){
            int exit=scanner.nextInt();//no of passenger exit at stop i
            int enter = scanner.nextInt();//no of passenger enter at stop i

            currentPassengers=currentPassengers-exit+enter;
            //so for iteration 1 , out of n=3 stops,currentPassengers=0-0+3=3 ;for exit=[0,2,4] and entry=[3,5,2]
            //iteration 2,current=3-2+5=6;iteration 3,current=6-4+2=4
            //and  i want my minCapacity to be the maximum value of currentPassengers according to rule
            minimumCapacity=minimumCapacity>currentPassengers?minimumCapacity:currentPassengers;
            
        }
        System.out.println(minimumCapacity);
        scanner.close();



        
    }
}