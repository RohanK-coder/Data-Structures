package Collections;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(45);
        list.add(25);
        list.add(0);
        list.add(68);
        list.add(32);
        Collections.sort(list);
        for (int num:list){
            System.out.println(num);
        }
        System.out.println();
        //sort in reverse order
        list.sort(Collections.reverseOrder());
        for(int n:list){
            System.out.println(n);
        }
    }

}
