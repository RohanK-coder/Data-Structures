package basicMaths;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(7392164));
    }
    public static int count(int n){
        return (int)(Math.log10(n)+1);
    }
}

