import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(45);
//        stack.push(54);
//        stack.push(4);
//        stack.push(5);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(45);
        queue.add(4);
        queue.add(5);
        queue.add(34);

        System.out.println(queue.remove());

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(45);
//        deque.addFirst(54);
//        deque.removeLast();
    }
}
