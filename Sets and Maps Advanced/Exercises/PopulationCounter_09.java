package SetsAndMapsAdvancedExercise;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Map<String, Map<String, Long>> populationMap = new LinkedHashMap<>();
        Map<String, Long> countriesPopulationMap = new LinkedHashMap<>();


        while (!inputLine.equals("report")){
            String[] inputLineParts = inputLine.split("\\|");
            String countryName = inputLineParts[1];
            String cityName = inputLineParts[0];
            long populationOfCity = Long.parseLong(inputLineParts[2]);

            if(!populationMap.containsKey(countryName)){

                populationMap.put(countryName, new HashMap<>());
                populationMap.get(countryName).put(cityName, populationOfCity);
            }else{
                if(!populationMap.get(countryName).containsKey(cityName)){
                    populationMap.get(countryName).put(cityName, populationOfCity);
                }else{
                   populationMap.get(countryName).put(cityName, populationMap.get(countryName).get(cityName) + populationOfCity);
                }
            }
            if(!countriesPopulationMap.containsKey(countryName)){
                countriesPopulationMap.put(countryName, populationOfCity);
            }else{
                countriesPopulationMap.put(countryName, countriesPopulationMap.get(countryName) + populationOfCity);
            }
            inputLine = scanner.nextLine();
        }

        countriesPopulationMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed())
                .forEach(currentCountry -> {
                    System.out.printf("%s (total population: %d)%n",
                            currentCountry.getKey(), currentCountry.getValue());

                    populationMap.get(currentCountry.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Long>comparingByValue()
                                    .reversed())
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });
    }
}
