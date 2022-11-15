package SetsAndMapsAdvancedExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elementSet = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (String element : elements){
                elementSet.add(element);
            }
        }
        String result = String.join(" ", elementSet);
        System.out.println(result);
    }
}
