package Collections;
import java.util.*;

public class HS
{

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<Book> books = new HashSet<>();
        Book b1 = new Book(2,"Java Book","Sri","Dont know");
        Book b2 = new Book(3,"Java Book","Sri","Dont know");
        set.add("Romy");
        set.add("Rohan");
        set2.add("Nickname");
        set2.add("People's name");
        set.addAll(set2);
        books.add(b1);
        books.add(b2);


        for (String s : set) {
            System.out.println(s);
        }
        for(Book b: books){
            System.out.println(b.id);
        }

    }
}
class Book{
    int id;
    String name,author,publisher;


    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
}


// 1. contains unique elements only
// 2. allows null value
// 3. doesnt maintain insertion order
// 4. best approach for search operations
// 5. hashset is achieved using hashing

// List contains duplicate elements where as a set contains only unique elements