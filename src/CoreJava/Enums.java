package CoreJava;

public class Enums {
    enum Level{
        LOW,HIGH,MEDIUM
    }
    public static String lev = String.valueOf(Level.HIGH);

    public static void main(String[] args) {
        System.out.println(lev);
    }
}
