package Hashing;
import java.util.*;
public class Counter {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] hash = new int[10];
        for(int i=0;i<10;i++){
            hash[arr[i]] += 1;
        }
        for (int i=0;i<hash.length;i++){
            System.out.println("the number "+arr[i]+" appeared "+hash[i] + " number of times.");
        }
    }
}
