package Threads;

public class SequentialExecution {
    public static void main(String[] args) {
        demo1();
        demo2();
    }
    public static void demo1(){
        System.out.println("demo1");
    }
    public static void demo2(){
        System.out.println("demo2");
    }
}
// single thread application