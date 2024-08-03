package CoreJava;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a length : ");
            int len = sc.nextInt();

        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception caught build done successfully");
        }

    }
}
