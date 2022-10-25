package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> childrenQueue = new ArrayDeque<>();
        for (String child : children){
            childrenQueue.offer(child);
        }

        while (childrenQueue.size() > 1){
            for (int i = 1; i < n; i++) {
                childrenQueue.offer(childrenQueue.poll());
            }
            System.out.println("Removed " + childrenQueue.poll());
        }
        System.out.println("Last is " + childrenQueue.poll());
    }
}
