import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Generic -> type-safe
        List<String> list=new ArrayList<>();
        // Not generic-> Non type safe
        List anotherList=new ArrayList<>();

        Box<String> b1=new Box<>("Hello");
        System.out.println(b1.getValue());

        Box<Integer> b2=new Box<>(121);
        System.out.println(b2.getValue());

    }
}
