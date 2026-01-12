import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
//        Node node1 = new Node();
//        Node node2 = new Node();
//
//        node1.value = 1;
//        node2.value = 2;
//
//        node1.next = node2;
//        node2.next = null;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.get(2); //O(n)
        linkedList.addLast(2); //O(1)
        linkedList.addFirst(0); //O(1)
        linkedList.getLast();
        linkedList.getFirst();
        System.out.println(linkedList);
        linkedList.removeIf((x) -> x%2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));

        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}

//class Node{
//    public int value;
//    public Node next;
//}

