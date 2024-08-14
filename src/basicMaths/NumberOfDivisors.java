package basicMaths;

import java.util.ArrayList;

public class NumberOfDivisors {
    public static void main(String[] args) {
        System.out.println(getDivisors(36));

    }
    public static ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        int d = (int)Math.sqrt(n);
        for(int i=1;i<=d;++i){
            if(n%i==0){
                divisors.add(i);
                if(i!=(n/i)){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}
