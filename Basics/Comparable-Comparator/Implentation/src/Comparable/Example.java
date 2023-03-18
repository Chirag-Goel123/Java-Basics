package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        ArrayList<Emp> list=new ArrayList<>();
        list.add(new Emp("Chirag","123",1));
        list.add(new Emp("Durgesh","321",10));
        list.add(new Emp("Aman","425",5));
        list.add(new Emp("Radhe","981",8));
        //System.out.println(list);
        // Override toString()-> for output
        Collections.sort(list);
        System.out.println(list);
    }
}
