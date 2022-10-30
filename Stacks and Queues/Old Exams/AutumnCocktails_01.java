package OldExams;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AutumnCocktails_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(ingredientsQueue::offer);

        ArrayDeque<Integer> freshnessLevelStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(freshnessLevelStack::push);

        TreeMap<String, Integer> cockTailsListMap = new TreeMap<>();
        boolean flagForPreparedCocktails = false;
        boolean lastValueIs0 = false;
        int sumOfLeftIngredients = 0;


        while (!ingredientsQueue.isEmpty() && !freshnessLevelStack.isEmpty()){
            int currentIngredients = ingredientsQueue.peek();
            int currentFreshnessLevel = freshnessLevelStack.peek();

            if(currentIngredients == 0){
                ingredientsQueue.poll();
                if(!ingredientsQueue.isEmpty()){
                    currentIngredients = ingredientsQueue.peek();
                }
            }

            if(currentIngredients * currentFreshnessLevel == 150){
                if(!cockTailsListMap.containsKey("Pear Sour")){
                    cockTailsListMap.put("Pear Sour", 1);
                }else{
                    cockTailsListMap.put("Pear Sour", cockTailsListMap.get("Pear Sour") + 1);
                }
                ingredientsQueue.poll();
                freshnessLevelStack.pop();
            }else if(currentIngredients * currentFreshnessLevel == 250){
                if(!cockTailsListMap.containsKey("The Harvest")){
                    cockTailsListMap.put("The Harvest", 1);
                }else{
                    cockTailsListMap.put("The Harvest", cockTailsListMap.get("The Harvest") + 1);
                }
                ingredientsQueue.poll();
                freshnessLevelStack.pop();
            }else if(currentIngredients * currentFreshnessLevel == 300){
                if(!cockTailsListMap.containsKey("Apple Hinny")){
                    cockTailsListMap.put("Apple Hinny", 1);
                }else{
                    cockTailsListMap.put("Apple Hinny", cockTailsListMap.get("Apple Hinny") + 1);
                }
                ingredientsQueue.poll();
                freshnessLevelStack.pop();
            }else if(currentIngredients * currentFreshnessLevel == 400){
                if(!cockTailsListMap.containsKey("High Fashion")){
                    cockTailsListMap.put("High Fashion", 1);
                }else{
                    cockTailsListMap.put("High Fashion", cockTailsListMap.get("High Fashion") + 1);
                }
                ingredientsQueue.poll();
                freshnessLevelStack.pop();
            }else{
                freshnessLevelStack.pop();
                ingredientsQueue.poll();
                currentIngredients += 5;
                ingredientsQueue.addLast(currentIngredients);
            }
            if(cockTailsListMap.containsKey("Pear Sour") && cockTailsListMap.containsKey("The Harvest") &&
            cockTailsListMap.containsKey("Apple Hinny") && cockTailsListMap.containsKey("High Fashion")){
                flagForPreparedCocktails = true;
            }

        }
        if(!ingredientsQueue.isEmpty()){
            for (int ingredient : ingredientsQueue){
                sumOfLeftIngredients += ingredient;
            }
        }
        if(!flagForPreparedCocktails){
            System.out.print("What a pity! You didn't manage to prepare all cocktails.");
            if(sumOfLeftIngredients != 0){
                System.out.printf("%nIngredients left: %d", sumOfLeftIngredients);
            }
            for(var pairCocktails : cockTailsListMap.entrySet()){
                System.out.printf("%n# %s --> %d", pairCocktails.getKey(), pairCocktails.getValue());
            }
        }else{
            System.out.print("It's party time! The cocktails are ready!");
            if(sumOfLeftIngredients != 0){
                System.out.printf("%nIngredients left: %d", sumOfLeftIngredients);
            }
            for(var pairCocktails : cockTailsListMap.entrySet()){
                System.out.printf("%n# %s --> %d", pairCocktails.getKey(), pairCocktails.getValue());
            }
        }
    }
}
