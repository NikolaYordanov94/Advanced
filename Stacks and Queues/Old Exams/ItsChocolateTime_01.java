package OldExams;
import java.util.*;

public class ItsChocolateTime_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkValuesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).forEach(milkValuesQueue::offer);

        ArrayDeque<Double> cacaoValuesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).forEach(cacaoValuesStack::push);

        TreeMap<String, Integer> typeOfChocolates = new TreeMap<>();


        while (!milkValuesQueue.isEmpty() && !cacaoValuesStack.isEmpty()){

            double currentMilkValue = milkValuesQueue.poll();
            double currentCacaoValue = cacaoValuesStack.pop();

            if(currentCacaoValue / (currentMilkValue + currentCacaoValue) == 0.30){
                if(typeOfChocolates.containsKey("Milk")){
                    typeOfChocolates.put("Milk", typeOfChocolates.get("Milk") + 1);
                }else{
                    typeOfChocolates.put("Milk", 1);
                }

            }else if(currentCacaoValue / (currentMilkValue + currentCacaoValue) == 0.50){
                if(typeOfChocolates.containsKey("Dark")){
                    typeOfChocolates.put("Dark", typeOfChocolates.get("Dark") + 1);
                }else{
                    typeOfChocolates.put("Dark", 1);
                }

            }else if(currentCacaoValue / (currentMilkValue + currentCacaoValue) == 1.00){
                if(typeOfChocolates.containsKey("Baking")){
                    typeOfChocolates.put("Baking", typeOfChocolates.get("Baking") + 1);
                }else{
                    typeOfChocolates.put("Baking", 1);
                }

            }else{
                currentMilkValue += 10;
                milkValuesQueue.offer(currentMilkValue);
            }
        }
        if(typeOfChocolates.get("Milk") != null && typeOfChocolates.get("Dark") != null && typeOfChocolates.get("Baking") != null){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            for (var pair : typeOfChocolates.entrySet()){
                System.out.printf("# %s Chocolate --> %d%n", pair.getKey(), pair.getValue());
            }
        }else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            for (var pair : typeOfChocolates.entrySet()){
                System.out.printf("# %s Chocolate --> %d%n", pair.getKey(), pair.getValue());
            }
        }
    }
}
