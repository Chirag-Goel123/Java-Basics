package learn;
// import util package
import java.util.*;
public class StartCode{
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

        /*
        creating collection
        1) Type Safe-same type of elements are added to collection
        Example: ArrayList<String> -> Generic ways of creating collection.
        Only add string 

        2) UnType Safe-different types of elements can be added
        Example: 
        */

        // Type Safe
        ArrayList<String> names=new ArrayList<>();
        names.add("Chirag");
        names.add("Goel");
        names.add("Ram");
        names.add("Shyam");
        names.add("Ram");
        System.out.println(names);
        // System.out.println(names.get(0));
        // System.out.println(names.get(1));
        names.remove("Goel");
        System.out.println(names);
        System.out.println(names.isEmpty());

        // un type safe
        LinkedList list=new LinkedList();
        list.add("Sachin");
        list.add(1);
        list.add(10.89);
        list.add(true);
        System.out.println(list);

        Vector<String> vector=new Vector<>();
        vector.addAll(names);
        System.out.println("VECTOR "+vector);
    }
}