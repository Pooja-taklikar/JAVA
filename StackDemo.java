import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty()); //true/false
        System.out.println(stack.size());
        System.out.println(stack.search(2)); // Search in top bottom(indexing start from 1)

//        Due to doubly linked list we can use
        LinkedList<Integer> linkedListAsStack = new LinkedList<>();
        linkedListAsStack.addLast(1);
        linkedListAsStack.addLast(2);

        linkedListAsStack.removeFirst(); // pop
        linkedListAsStack.getLast(); //peek
        linkedListAsStack.size();
        linkedListAsStack.isEmpty();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.get(arrayList.size() - 1); //peak
        arrayList.remove(arrayList.size() - 1); //pop
        
    }
}
