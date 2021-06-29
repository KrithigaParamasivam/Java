import java.io.*;
import java.util.*;
import java.util.Stack;

class Stack3
{
    static void stack_push(Stack<Integer> stack)
    {
        System.out.println("Push Operation:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Initial Stack: " + stack);
    }

    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        System.out.println("Popped element: "
                + stack.pop());
        System.out.println("Popped element: "
                + stack.pop());
        System.out.println("After Popping: "
                + stack);
    }

    static void stack_peek(Stack<Integer> stack)
    {
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());
    }

    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_peek(stack);
        stack_search(stack, 20);
        stack_search(stack, 60);
    }
}