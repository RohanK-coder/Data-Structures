import java.net.URL;

public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.print(i+ " ");
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World");
        try{
            URL url = new URL("https://www.google.com");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Math.sqrt(156));
    }
}


//commit testing
//commit retest
//commit test2