package learn;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();
        courses.put("Core Java",4000);
        courses.put("Python",3500);
        System.out.println(courses);

        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });
    }
}
