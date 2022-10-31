package MultidimensionalArrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int rows = 2 * m;
        String[][] matrix = new String [rows][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        for (int r = 0; r < matrix.length - m; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                    if(!matrix[r][c].equals(matrix[r + m][c])){
                        matrix[r][c] = "*";
                    }
                }
            }

        for (int rowsFinal = 0; rowsFinal < matrix.length - m; rowsFinal++) {
            for (int colsFinal = 0; colsFinal < n; colsFinal++) {
                System.out.print(matrix[rowsFinal][colsFinal] + " ");
            }
            System.out.println();
        }
    }
}
