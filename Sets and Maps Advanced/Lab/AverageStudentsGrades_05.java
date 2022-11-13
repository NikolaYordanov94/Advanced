package SetsAndMapsAdvanced;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> studentGradesMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String inputStudentInfo = scanner.nextLine();
            String[] studentNameAndGradeArr = inputStudentInfo.split(" ");
            String studentName = studentNameAndGradeArr[0];
            double studentGrade = Double.parseDouble(studentNameAndGradeArr[1]);

            if(!studentGradesMap.containsKey(studentName)){
                studentGradesMap.put(studentName, new ArrayList<>());
                studentGradesMap.get(studentName).add(studentGrade);
            }else{
                studentGradesMap.get(studentName).add(studentGrade);
            }
        }
        double totalGrade = 0.00;
        for (var pair : studentGradesMap.entrySet()) {
            System.out.printf("%s -> ", pair.getKey());
            for (Double studentEachGrade : studentGradesMap.get(pair.getKey())){
                System.out.printf("%.2f ", studentEachGrade);
                totalGrade += studentEachGrade;
            }
            System.out.printf("(avg: %.2f)", totalGrade / pair.getValue().size());
            System.out.println();
            totalGrade = 0.00;
        }
    }
}
