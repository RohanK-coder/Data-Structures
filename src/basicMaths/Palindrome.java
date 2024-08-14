package basicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter num to check for palindrome : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if(d==reverse(d)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrome");

    }
    public static int reverse(int n){

        int reversedNum=0;
        int temp;
        while(n!=0){
            temp = n%10;
            reversedNum = reversedNum*10+temp;
            n/=10;
        }
        return reversedNum;
    }
}
