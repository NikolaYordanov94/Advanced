package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int countToPush = Integer.parseInt(input[0]); //elements to add
        int countToPop = Integer.parseInt(input[1]); //elements to pop
        int elementToSearch = Integer.parseInt(input[2]); //elements we are looking for
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String [] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }

        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        //if we find number -> Print true
        //if we do not find it -> Print the minimum element
        //if stack is empty -> Print 0

        if(stack.isEmpty()){
            System.out.println("0");
        }else if(stack.contains(elementToSearch)){
            System.out.println(true);
        }else{
            int minElement = Integer.MAX_VALUE;
            for(Integer number : stack){
                if(number < minElement){
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }
    }
}
