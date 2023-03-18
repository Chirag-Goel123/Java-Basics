package learn;
import java.util.*;
public class SetInterface {
    public static void main(String[] args) {
        // Order Preserve Nhi hai
        HashSet<Double> nms=new HashSet<>();
        // Wrapper Class Pass karna hai
        // Auto Box-> Wrapper class mein automatically convert ho jaega
        // UnBoxing-< Jab nikalengye to unboxing
        nms.add(14.14);
        nms.add(34.56);
        nms.add(38.56);
        nms.add(90.56);
        nms.add(90.56);

        System.out.println(nms);


        // In Sorted Order
        TreeSet<Double> tset=new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

    }
}
