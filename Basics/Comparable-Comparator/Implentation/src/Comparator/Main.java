package Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pair> list=new ArrayList<>();
        list.add(new Pair("Chirag","123",1));
        list.add(new Pair("Durgesh","321",10));
        list.add(new Pair("Aman","425",5));
        list.add(new Pair("Radhe","981",8));
        System.out.println(list);
        Collections.sort(list,new NameComparator());
        System.out.println(list);

        ArrayList<Pair> list2=new ArrayList<>(list);
        Collections.sort(list2,new IdComparator());
        System.out.println(list2);
    }
    
}
