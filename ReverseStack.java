
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStack {
    static Stack<Object> stack;
    static Queue<Object> queue;

    static void reverseQueue()
    {
        queue = new LinkedList<Object>();

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());

        }
        System.out.println("queue elements: "+queue.toString());

        while (!queue.isEmpty()) {
            stack.push(queue.poll());

        }
        System.out.println(stack.toString());
    }

    // Driver code
    public static void main(String args[])
    {
        stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack elements: "+stack.toString());
        reverseQueue();

    }
}
