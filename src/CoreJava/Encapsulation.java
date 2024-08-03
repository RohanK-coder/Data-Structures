package CoreJava;

public class Encapsulation extends Student {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setId(21);
        System.out.println(obj.getId());
    }

}
class Student{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
