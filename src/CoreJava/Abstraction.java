package CoreJava;

public class Abstraction {
    public static void main(String[] args) {
        Exss obj = new Exss();
        obj.Ex();
        obj.Exs();
    }
}
class Exss extends Example{
    public void Ex(){
        System.out.println("Hello");
    }
    public void Exs(){
        System.out.println("Hello Well");
    }
}
abstract class Example{
    public abstract void Ex();
    public abstract void Exs();
}
