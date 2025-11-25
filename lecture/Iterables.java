package Lecture;
import java.util.*;

public class Iterables {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        System.out.println("Forward Traversal:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
