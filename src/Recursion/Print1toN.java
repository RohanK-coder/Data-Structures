package Recursion;

import java.util.Scanner;

public class Print1toN {
    public static int num = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        print1(n);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    public static void print1(int n){
        if(num> n)
            return;
        else{
            System.out.println(num);
            num++;
            print1(n);

        }
    }
}
