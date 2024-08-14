package basicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 23456;
        int reversedNum=0;
        int temp;
        while(n!=0){
            temp = n%10;
            reversedNum = reversedNum*10+temp;
            n/=10;
        }
        System.out.println(reversedNum);
    }
}
