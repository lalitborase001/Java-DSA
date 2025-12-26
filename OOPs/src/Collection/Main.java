package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(3);
//        list1.add(5);
//        list1.add(4);
//        System.out.println(list1);

        List<Integer> vector = new Vector<>();
        list1.add(1);
        vector.add(3);
        vector.add(5);
        vector.add(4);
        System.out.println(vector);
    }
}
