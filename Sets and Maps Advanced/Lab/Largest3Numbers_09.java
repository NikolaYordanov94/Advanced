package SetsAndMapsAdvanced;
import java.util.Scanner;
import java.util.TreeSet;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] inputLineNumArr = inputLine.split(" ");
        TreeSet<Integer> topIntegerSet = new TreeSet<>();

        for (int i = 0; i < inputLineNumArr.length; i++) {
            int currentNum = Integer.parseInt(inputLineNumArr[i]);

            topIntegerSet.add(currentNum);
        }
        int counter = 0;

        if(topIntegerSet.size() <= 3){
            for (int n : topIntegerSet.descendingSet()){
                System.out.print(n + " ");
            }
        }else{
            for (int n : topIntegerSet.descendingSet()){
                    System.out.print(n + " ");
                    counter++;
                    if(counter == 3){
                        break;
                    }
                }
            }
        }
    }
