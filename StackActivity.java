
import java.util.Stack;

public class StackActivity {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // Adding elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println("Stack: " + stack);

        // Display top element
        System.out.println("Top element: " + stack.peek());

        // Remove top element
        System.out.println("Removed: " + stack.pop());

        // Display updated stack
        System.out.println("Updated Stack: " + stack);
    }
}
