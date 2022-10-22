package StacksAndQueues;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int sumMinus = 0;
        int sumPlus = Integer.parseInt(input[0]);

        for (int i = 0; i < input.length; i++) {
            String currentElement = input[i];

            if(currentElement.equals("-")){
                sumMinus += Integer.parseInt(input[i + 1]);
            }else if(currentElement.equals("+")){
                sumPlus += Integer.parseInt(input[i + 1]);
            }
        }
        System.out.println(sumPlus - sumMinus);
    }
}
