package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2)
    {
        return p1.name.compareTo(p2.name);
    }
    
}
