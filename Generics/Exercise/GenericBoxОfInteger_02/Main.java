package GenericsExercise.GenericBoxОfInteger_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box();

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }
        System.out.println(box);
    }
}
