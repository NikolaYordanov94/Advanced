package WorkshopCustomDataStructures;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(12);
        stack.push(42);
        stack.push(4223);

        stack.pop();
        SmartArray smartArray = new SmartArray();
        smartArray.add(13);
        smartArray.add(15);
        smartArray.add(132);
        smartArray.remove(1);

        smartArray.forEach(System.out::println);

        stack.forEach(System.out::println);
    }
}

