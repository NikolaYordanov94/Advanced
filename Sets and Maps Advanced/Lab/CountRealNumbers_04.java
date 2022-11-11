package SetsAndMapsAdvanced;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] numbersArr = inputLine.split(" ");

        LinkedHashMap<Double, Integer> realNumMap = new LinkedHashMap<>();

        for (int i = 0; i < numbersArr.length; i++) {
            double currentNum = Double.parseDouble(numbersArr[i]);

            if(!realNumMap.containsKey(currentNum)){
                realNumMap.put(currentNum, 1);
            }else{
                realNumMap.put(currentNum, realNumMap.get(currentNum) + 1);
            }
        }
        for (var pair : realNumMap.entrySet()){
            System.out.printf("%.1f -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}
