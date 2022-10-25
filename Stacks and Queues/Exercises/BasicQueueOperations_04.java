package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        int countToOffer = Integer.parseInt(input[0]);
        int countToPoll = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countToOffer; i++) {
            queue.offer(Integer.parseInt(numbersToAdd[i]));
        }

        for (int i = 0; i < countToPoll; i++) {
            queue.pop();
        }
        if(queue.isEmpty()){
            System.out.println("0");
        }else if(queue.contains(elementToSearch)){
            System.out.println(true);
        }else{
            int minElement = Integer.MAX_VALUE;
            for(Integer number : queue){
                if(number < minElement){
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }
    }
}
