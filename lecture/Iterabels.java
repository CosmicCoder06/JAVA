import java.util.*;

public class Iterabels {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

Iterator iterator = list.iterator();

System.out.println("Forward Transversal:");

while(iterator.hasNext()){
    System.out.print(iterator.next() + " ");
}

System.out.println();
iterator.remove();
System.out.println("list:");