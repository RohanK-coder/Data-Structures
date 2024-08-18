package Recursion;


public class Printing {
    public static int count = 0;

    public static void main(String[] args) {

        printer();
    }
    public static void printer(){


        if(count==4){
            return;
        }
        else{
            System.out.println(count);
            count++;
            printer();

        }
    }
}

// if we write a return anywhere in the function it immediately gets terminated