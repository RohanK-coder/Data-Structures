package CoreJava;

public class Interface implements Carnivore,Dog {
    public void eats(){

    }

    @Override
    public void runs() {

    }

    @Override
    public void sleeps() {

    }

    @Override
    public void plays() {

    }

    public static void main(String[] args) {
        System.out.println("Interface implemented");
    }
}
interface Carnivore{
    //interface method is by default public and abstract
    void eats();
    void sleeps();
}
interface Dog{
    void plays();
    void runs();
}
