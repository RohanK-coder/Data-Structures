package Collections;
import java.util.ArrayList;
import java.util.Collections;
class Student{
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}
public class AL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rohan Kommathoti");
        list.add("Adele");
        list.add("Jay Z");
        list.add("Travis");
        list.add("Kanye");
        list.add("Kim");
        System.out.println(list);

        //using for-each
        for(String name:list){
            System.out.println(name);
        }

        //get and set methods
        System.out.println("First person is "+list.get(0));
        list.set(0,"Justin Bieber");
        System.out.println("First person changed to "+list.get(0));

        //Sorting an ArrayList
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(24);
        intList.add(47);
        intList.add(28);
        intList.add(11);
        intList.add(7);
        intList.add(5);
        System.out.println("List before sorting "+intList);
        Collections.sort(intList);
        System.out.println("After sorting "+intList);

        //Array of Objects - line 4-14 reference

        ArrayList<Student> objects= new ArrayList<Student>();
        Student s1 = new Student(101,"Messi",14);
        Student s2 = new Student(102,"Ronaldo",21);
        Student s3 = new Student(103,"Pique",17);
        Student s4 = new Student(104,"Xavi",12);
        objects.add(s1);
        objects.add(s2);
        objects.add(s3);
        objects.add(s4);
        for(Student student:objects){
            System.out.println(student.rollNo +" "+student.name+" "+student.age);
        }

        //checking size of arrayList
        System.out.println(objects.size());


    }
}

/*
1) uses a dynamic array for storing the elements
2) No Size Limit
3) Can have duplicate elements also
4) we need to use wrapper classes for implementation
5) AL extends -> AbstractList implements -> ListInterface
 */
