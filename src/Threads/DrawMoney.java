package Threads;

import java.util.*;

public class DrawMoney {
    public static int amount = 1000;
    public static void main(String[] args) {
        System.out.println(amount);
        Thread t1 = new Thread(()->{

                draw(100);
        });
        System.out.println(amount);
        Thread t2 = new Thread(()->{
            draw(200);
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(amount);
    }

    public synchronized static void draw(int x){
        amount=amount-x;
        System.out.println("Took "+x+" "+"amount");
    }

}

