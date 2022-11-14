package SetsAndMapsAdvanced;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> gradesByStudents = new TreeMap<>();

        while (n-- > 0){
            String name = scanner.nextLine();

            double grade = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .average().orElse(0);

            gradesByStudents.put(name, grade);
        }
        NumberFormat nf = new DecimalFormat("#.##############################");
        BigDecimal gr = new BigDecimal(0);
        gradesByStudents.forEach((name, grade) -> System.out.printf("%s is graduated with %s%n", name, nf.format(grade)));
    }
}
