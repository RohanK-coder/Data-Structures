package Collections;
import java.util.*;

public class HS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Romy");

        for (String s : set) {
            System.out.println(s);
        }

    }
}

// 1. contains unique elements only
// 2. allows null value
// 3. doesnt maintain insertion order
// 4. best approach for search operations
// 5. hashset is achieved using hashing

// List contains duplicate elements where as a set contains only unique elements