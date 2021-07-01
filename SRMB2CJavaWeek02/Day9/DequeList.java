import java.util.*;
public class DequeList{
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.push(40);

        for (int i : deque) {
            System.out.println(i);

        }
        System.out.println("The element in the stack" + deque);
        System.out.println("The element in the stack" + deque);
        System.out.println("popped Element: "+deque.pop());
        System.out.println("After Popping: " + deque);
        System.out.println("The element at the top of the" + " stack is: " + deque.peek());
    }
}