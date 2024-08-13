package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HM {
    public static void main(String[] args) {
        // put and get are used to insert and return the values
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"AP");
        map.put(2,"Bihar");
        map.put(3,"Telangana");
        map.put(4,"Kerala");
        map.put(5,"Tamil Nadu");
        System.out.println(map.toString());
        System.out.print("Enter the integer of the state : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The State : ");
        System.out.print(map.get(n));
        System.out.println("The size of the map is : "+map.size());

    }
}
