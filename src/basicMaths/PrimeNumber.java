package basicMaths;

import java.util.ArrayList;

public class PrimeNumber extends NumberOfDivisors{
    public static void main(String[] args) {
        if(prime(6)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static boolean prime(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        divisors = getDivisors(n);
        if(divisors.size()>2)
        {
            return false;
        } else if (divisors.size()>0&&divisors.size()<=2)
        {
            return true;

        }
        else {
            return false;
        }
    }
}
