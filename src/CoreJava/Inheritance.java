package CoreJava;

public class Inheritance {
    public static void main(String[] args) {
        StreetAnimal str = new StreetAnimal();
        System.out.println(str.nm);
    }
}
class Animal{
    String name = "dog";
}
class StreetAnimal extends Animal{
    String nm = name;
}
