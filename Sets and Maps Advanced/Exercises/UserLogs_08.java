package SetsAndMapsAdvancedExercise;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> usernamesMap = new TreeMap<>();

        while (!inputLine.equals("end")){

            String[] inputLineParts = inputLine.split(" ");
            String ipAddress = inputLineParts[0].substring(3);
            String user = inputLineParts[2].substring(5);

            if(!usernamesMap.containsKey(user)){
                usernamesMap.put(user, new LinkedHashMap<>());
                usernamesMap.get(user).put(ipAddress, 1);
            }else{
                if(!usernamesMap.get(user).containsKey(ipAddress)){
                    usernamesMap.get(user).put(ipAddress, 1);
                }else{
                    usernamesMap.get(user).put(ipAddress, usernamesMap.get(user).get(ipAddress) + 1);
                }
            }
            inputLine = scanner.nextLine();
        }
        int currentPair = 0;
        for (var pair : usernamesMap.entrySet()){
            System.out.printf("%s: %n", pair.getKey());
            for (var pairIpCount : pair.getValue().entrySet()){
                currentPair++;
                if(pair.getValue().size() == currentPair){
                    System.out.printf("%s => %d.%n", pairIpCount.getKey(), pairIpCount.getValue());
                }else{
                    System.out.printf("%s => %d, ", pairIpCount.getKey(), pairIpCount.getValue());
                }
            }
            currentPair = 0;
        }
    }
}
