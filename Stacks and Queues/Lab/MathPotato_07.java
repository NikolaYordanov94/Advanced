package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato_07 {
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
            int num = 0;
            if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || num == 23){
                System.out.println("Prime " + childrenQueue.peek());
            }else{
                System.out.println("Removed " + childrenQueue.poll());
            }
            num ++;
        }
        System.out.println("Last is " + childrenQueue.poll());
    }
}
