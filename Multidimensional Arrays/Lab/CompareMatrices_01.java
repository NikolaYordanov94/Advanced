package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int [][] firstMatrix = readMatrix(rows, cols, scanner);

        rowsAndCols = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

        int [][] secondMatrix = readMatrix(rows, cols, scanner);

        if (areMatrixEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
    // метод за проверка за еднаквост на матрици:
    private static boolean areMatrixEqual(int[][] firstMatrix, int[][] secondMatrix) {
        boolean areEquals = true;

        if (firstMatrix.length != secondMatrix.length) {    //проверяваме дължините на матриците
            areEquals = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                if (firstMatrix[i].length != secondMatrix[i].length) {   //проверяваме дължините на масивите
                    areEquals = false;
                    break;
                } else {
                    for (int j = 0; j < firstMatrix[i].length; j++) {
                        if (firstMatrix[i][j] != secondMatrix[i][j]) {     //проверяваме елементите на матриците
                            return false;
                        }
                    }
                }

            }
        }
        return areEquals;
    }

    // метод за четене на матрица от конзолата:
    private static int[][] readMatrix(int row, int col, Scanner scanner) {
        int [][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}