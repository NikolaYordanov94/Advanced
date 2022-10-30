package OldExams;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Blacksmith_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> steelQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(steelQueue::offer);

        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(carbonStack::push);

        TreeMap<String, Integer> swordsListMap = new TreeMap<>();
        int swordCounter = 0;
        StringBuilder builder = new StringBuilder("");

       while (!steelQueue.isEmpty() && !carbonStack.isEmpty()){
           int currentSteelValue = steelQueue.poll();
           int currentCarbonValue = carbonStack.pop();

           if(currentSteelValue + currentCarbonValue == 70){
               if(!swordsListMap.containsKey("Gladius")){
                   swordsListMap.put("Gladius", 1);
               }else{
                   swordsListMap.put("Gladius", swordsListMap.get("Gladius") + 1);
               }
               swordCounter++;
           }else if(currentSteelValue + currentCarbonValue == 80){
               if(!swordsListMap.containsKey("Shamshir")){
                   swordsListMap.put("Shamshir", 1);
               }else{
                   swordsListMap.put("Shamshir", swordsListMap.get("Shamshir") + 1);
               }
               swordCounter++;
           }else if(currentSteelValue + currentCarbonValue == 90){
               if(!swordsListMap.containsKey("Katana")){
                   swordsListMap.put("Katana", 1);
               }else{
                   swordsListMap.put("Katana", swordsListMap.get("Katana") + 1);
               }
               swordCounter++;
           }else if(currentSteelValue + currentCarbonValue == 110){
               if(!swordsListMap.containsKey("Sabre")){
                   swordsListMap.put("Sabre", 1);
               }else{
                   swordsListMap.put("Sabre", swordsListMap.get("Sabre") + 1);
               }
               swordCounter++;
           }else{
               currentCarbonValue += 5;
               carbonStack.push(currentCarbonValue);
           }
       }
        if(swordsListMap.isEmpty()){
            System.out.println("You did not have enough resources to forge a sword.");
            if(steelQueue.isEmpty()){
                System.out.println("Steel left: none");
                builder.append("Carbon left: ");
                for(int carbon : carbonStack){
                    builder.append(carbon).append(", ");
                }
                builder.replace(builder.length() - 2, builder.length(), "");
                System.out.print(builder);
            }else{
                System.out.println("Steel left: ");
                for(int steel : steelQueue){
                    System.out.printf("%d, ", steel);
                }
                System.out.print("Carbon left: none");
            }
        }else{
            System.out.printf("You have forged %d swords.%n", swordCounter);
            if(steelQueue.isEmpty()){
                System.out.println("Steel left: none");
                builder.append("Carbon left: ");
                for(int carbon : carbonStack){
                    builder.append(carbon).append(", ");
                }
                builder.replace(builder.length() - 2, builder.length(), "");
                System.out.print(builder);
                for (var sword : swordsListMap.entrySet()){
                    System.out.printf("%n%s: %d", sword.getKey(), sword.getValue());
                }
            }else{
                System.out.println("Steel left: ");
                for(int steel : steelQueue){
                    System.out.printf("%d, ", steel);
                }
                System.out.print("Carbon left: none");
                for (var sword : swordsListMap.entrySet()){
                    System.out.printf("%n%s: %d", sword.getKey(), sword.getValue());
                }
            }
        }
    }
}
