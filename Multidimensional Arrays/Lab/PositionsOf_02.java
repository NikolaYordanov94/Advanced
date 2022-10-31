package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int [][] matrix = new int [rows][cols];
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean isFoundAtLeastOnce = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNum = matrix[r][c];
                if(currentNum == searchedNumber){
                    System.out.println(r + " " + c);
                    isFoundAtLeastOnce = true;
                }
            }
        }
        if (!isFoundAtLeastOnce){
            System.out.println("not found");
        }
    }
}
