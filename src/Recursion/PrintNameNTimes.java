package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static String name = "Rohan";
    public static int i =1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        print(num);
    }
    public static void print(int n){

        if(i>n)
            return;
        else{
            i++;
            System.out.println(name);
            print(n);
        }
    }
}

