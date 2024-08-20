package Recursion;

import java.util.Scanner;

public class SumOfFirstN {
    public static int sum = 0;
    public static int count = 0;
    public static int n;
    public static int i=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me the number to calculate the sum : ");
        n = sc.nextInt();
        print3(n);
        System.out.println("The Sum is : "+sum);
    }
    public static void print3(int num) {
        if (count >= n)
            return;
        else {
            sum += i;
            i++;
            count++;
            print3(num);

        }
    }

}
