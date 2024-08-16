package Threads;

public class ExtendsThreadExample {
    public static void main(String[] args) {
        Thread one = new Thread1();
        Thread two = new Thread2();
        one.start();
        two.start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
      int i=5;
      while(i!=0){
          System.out.println("from thread one "+i);
          i--;
      }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        int i=5;
        while(i!=0){
            System.out.println("from thread two "+i);
            i--;
        }
    }
}
