package Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2)
    {
        return p1.empId-p2.empId;
    }
    
}
