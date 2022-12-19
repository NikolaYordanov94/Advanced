package FunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean isFound = false;

        Function<List<Integer>, Integer> functionMin = list -> {

            int min = Integer.MAX_VALUE;
            for (int number : numList){
                if(number <= min){
                    min = number;
                }
            }
            return numList.lastIndexOf(min);
        };
        int indexOfMin = functionMin.apply(numList);
        System.out.println(indexOfMin);
    }
}
