package basicMaths;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(getArmstrong(371));
    }
    public static int getArmstrong(int n){
        int noOfDigits = (int)Math.log10(n)+1;
        int counter=0;
        while(n!=0){
            counter += (int) Math.pow(n%10,noOfDigits);
            n/=10;
        }
        return counter;
    }
}
