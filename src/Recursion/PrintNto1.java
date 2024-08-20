package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNto1 {
    public static int num;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        print2(num);
        System.out.println(arr);
    }
    public static void print2(int n){
        if(n<1){
            return;
        }
        else{
            System.out.println(n);
            arr.add(n);
            num--;
            print2(num);

        }

    }
}
