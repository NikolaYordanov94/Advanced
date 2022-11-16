package SetsAndMapsAdvancedExercise;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        LinkedHashMap<String, LinkedHashSet<String>> cardsOfEachPlayerMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> totalPointsOfEachPlayer = new LinkedHashMap<>();

        while (!inputLine.equals("JOKER")){
            String[] inputLineParts = inputLine.split(": ");
            String nameOfPlayer = inputLineParts[0];
            String[] cards = inputLineParts[1].split(", ");

            if(!cardsOfEachPlayerMap.containsKey(nameOfPlayer)){
                cardsOfEachPlayerMap.put(nameOfPlayer, new LinkedHashSet<>());
                for (int i = 0; i < cards.length; i++) {
                    cardsOfEachPlayerMap.get(nameOfPlayer).add(cards[i]);
                }
            }else{
                for (int i = 0; i < cards.length; i++) {
                    cardsOfEachPlayerMap.get(nameOfPlayer).add(cards[i]);
                }
            }
            inputLine = scanner.nextLine();
        }
        int totalPointsCounter = 0;

        for (var pair : cardsOfEachPlayerMap.entrySet()){
            for(String card : pair.getValue()){
                if(card.startsWith("2")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 2 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 2 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 2 * 2;
                    }else{
                        totalPointsCounter += 2;
                    }
                }else if(card.startsWith("3")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 3 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 3 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 3 * 2;
                    }else{
                        totalPointsCounter += 3;
                    }
                }else if(card.startsWith("4")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 4 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 4 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 4 * 2;
                    }else{
                        totalPointsCounter += 4;
                    }
                }else if(card.startsWith("5")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 5 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 5 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 5 * 2;
                    }else{
                        totalPointsCounter += 5;
                    }
                }else if(card.startsWith("6")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 6 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 6 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 6 * 2;
                    }else{
                        totalPointsCounter += 6;
                    }
                }else if(card.startsWith("7")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 7 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 7 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 7 * 2;
                    }else{
                        totalPointsCounter += 7;
                    }
                }else if(card.startsWith("8")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 8 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 8 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 8 * 2;
                    }else{
                        totalPointsCounter += 8;
                    }
                }else if(card.startsWith("9")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 9 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 9 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 9 * 2;
                    }else{
                        totalPointsCounter += 9;
                    }
                }else if(card.startsWith("10")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 10 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 10 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 10 * 2;
                    }else{
                        totalPointsCounter += 10;
                    }
                }else if(card.startsWith("J")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 11 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 11 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 11 * 2;
                    }else{
                        totalPointsCounter += 11;
                    }
                }else if(card.startsWith("Q")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 12 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 12 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 12 * 2;
                    }else{
                        totalPointsCounter += 12;
                    }
                }else if(card.startsWith("K")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 13 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 13 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 13 * 2;
                    }else{
                        totalPointsCounter += 13;
                    }
                }else if(card.startsWith("A")){
                    if(card.endsWith("S")){
                        totalPointsCounter += 14 * 4;
                    }else if(card.endsWith("H")){
                        totalPointsCounter += 14 * 3;
                    }else if(card.endsWith("D")){
                        totalPointsCounter += 14 * 2;
                    }else{
                        totalPointsCounter += 14;
                    }
                }
            }
            String currentPlayer = pair.getKey();
            if(!totalPointsOfEachPlayer.containsKey(currentPlayer)){
                totalPointsOfEachPlayer.put(currentPlayer, totalPointsCounter);
            }
            totalPointsCounter = 0;
        }
        for (var playerAndPoints : totalPointsOfEachPlayer.entrySet()){
            System.out.printf("%s: %d%n", playerAndPoints.getKey(), playerAndPoints.getValue());
        }
    }
}
