package Threads.synchronization;

public class SynchronizationDemo {
    private static int count = 0;
    public static void main(String[] args) {
        Thread one = new Thread(()->{
           for(int i=0;i<10000;i++){
               increment();
           }
        });
        Thread two = new Thread(()->{
            for(int i=0;i<10000;i++){
                increment();
            }
        });
        one.start();
        two.start();
        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // we use join because the sout statement should not be printed before the threads complete execution

        System.out.println(count);
    }
    private synchronized static void increment(){
        count++;
    }
}

//race condition where two threads try to access a shared resource
// by using synchronization we achieve mutual exclusion
