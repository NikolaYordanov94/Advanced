package MultidimensionalArraysExercise;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String [rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = inputRow[col];
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];
            if(commandType.equals("swap") && commandParts.length == 5) {
                int firstRow = Integer.parseInt(commandParts[1]);
                int firstCol = Integer.parseInt(commandParts[2]);
                int secondRow = Integer.parseInt(commandParts[3]);
                int secondCol = Integer.parseInt(commandParts[4]);
                if(firstRow < rows && firstCol < cols && secondRow < rows && secondCol < cols){
                    String firstElement = matrix[firstRow][firstCol];
                    String secondElement = matrix[secondRow][secondCol];
                    matrix[firstRow][firstCol] = secondElement;
                    matrix[secondRow][secondCol] = firstElement;

                    for (String[] arr : matrix){
                        for (String element : arr){
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("Invalid input!");
                }
            }else{
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}
