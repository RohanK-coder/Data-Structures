package Threads;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(()->{
            for(int i=0;i<4;i++){
                System.out.println("From thread one " + i);
            }
        });
        Thread two = new Thread(() -> {
            for(int i=0;i<4;i++){
                System.out.println("From thread two " + i);
            }
        });
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("done executing threads");

    }

}
