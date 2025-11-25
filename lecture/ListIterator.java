package Lecture;

import java.util.*;
public class ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        java.util.ListIterator<Integer> listIterator = list.listIterator(list.size());

        System.out.println("Backward Traversal:");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        System.out.println();
    }
}