package Collections;

import java.util.LinkedList;
public class LL{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("rohan");
        list.add("travis");
        list.add("posty");
        list.add("6ix9ine");
        for(String name:list){
            System.out.println(name);
        }
        list.add(2,"eminem");
        for(String name:list){
            System.out.println(name);
        }
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("rohan");
        list1.add("travis");
        list1.add("posty");
        list1.add("6ix9ine");
        System.out.println("After merging the elements");
        list.addAll(list1);
        System.out.println(list);
        list.remove("rohan");
        System.out.println(list);



    }
}
/*
Notes:
1) Uses doubly linked list to store the elements
2) can contain duplicate elements
3) LL extends AbstractList class and implements List and dequeue interfaces
4) maintains insertion order
5) manipulation is fast because no shifting needs to occur
6) can be used as a list,stack and queue
 */
