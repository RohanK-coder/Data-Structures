package basicMaths;

public class GCD1 {
    public static void main(String[] args) {
        System.out.println(gcd(20, 15));

    }
    public static int gcd(int n1,int n2)
    {
        int n=0;
        for(int i=1;i<=(Math.min(n1,n2));i++){
            if(n1%i==0&&n2%i==0){
                n=i;
            }
        }
        return n;
    }
}
