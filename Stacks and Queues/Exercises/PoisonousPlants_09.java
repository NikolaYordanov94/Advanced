package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stackPlants = new ArrayDeque<>();

        for (Integer plant : input){
            stackPlants.push(plant);
        }
        for (int i = 0; i < stackPlants.size(); i++) {
            int currentPlant = stackPlants.pop();
            int secondPlant = stackPlants.peek();
            if(currentPlant > secondPlant){

            }else{
                stackPlants.push(currentPlant);
            }
        }
        System.out.println(stackPlants);

    }
}
