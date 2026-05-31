import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 1st line contains 4 seperated integers  which is color of horseshoes the valera has, need to find minimum number of horseshoes he needs to buy so that all 4 horseshoes are of different color,  wait i realized the integer are suppose to be color of shoes right ? ye
public class Hoof21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hashset cause it will only store unqiue values,the goal is to read 4 elements in the set,find the size of set,and to decide the minimum color of horseshoe to buy, like 1 2 2 3 => integer represent color,so since 2 is repeated so we have 3 unique color so we need to buy  1 more,like 1 1 1 3 = only 2 unique color so we need to buy 2 more, the programming logic is .size reads unique element so adding 1 2 2 3 means the 2 is ignored and .size returns 3 ,so 4 -3 = 1 ,now say ,if it was 2 2 2 3, size would return 2,so 4-2 = 2
        Set<Integer> shoeColor = new HashSet<>();
        for(int i=0;i<4;i++){
            shoeColor.add(scanner.nextInt());
        }
        System.out.println(4-shoeColor.size());
        scanner.close();
    }
}