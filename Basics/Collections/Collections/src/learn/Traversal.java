package learn;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Chirag");
        names.add("Goel");
        names.add("Ram");
        names.add("Shyam");
        names.add("Ram");

        // for each loop
        for (String str : names) {
            System.out.println(str);
        }

        System.out.println("------------------------------");

        // trversing through iterator: Forward traversing
        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("------------------------------");

        // backward traversal :list iterator.
        // Also pass size 
        ListIterator<String> litr= names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

        System.out.println("------------------------------");
        // lambda Function
        // for each
        names.forEach(e->{
            System.out.println(e);
        });

    }
}
