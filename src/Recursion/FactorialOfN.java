package Recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static int sum = 0;
    public static int count = 0;
    public static int n;
    public static int i=1;
    public static int factorial = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print4(n);
        System.out.println("The factorial is : "+factorial);
    }
    public static void print4(int num) {
        if (count >= n)
            return;
        else {
            factorial *= i;
            i++;
            count++;
            print4(num);

        }
    }
}
