package Recursion;

public class Palindrome {
    public static String name = "rohan";
    public static void main(String[] args) {
        checkPal(name);
    }
    public static void checkPal(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if(sb.equals(word)){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }

    }
}
