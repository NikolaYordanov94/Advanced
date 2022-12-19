package FunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLength = Integer.parseInt(scanner.nextLine());

        List<String> wordList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> filterWord = word -> word.length() <= maxLength;

        wordList.stream().filter(filterWord).forEach(System.out::println);
    }
}
