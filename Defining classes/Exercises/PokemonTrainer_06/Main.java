package DefiningClassesExercise.PokemonTrainer_06;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!input.equals("Tournament")){
            String[] inputParts = input.split("\\s+");
            String nameOfTrainer = inputParts[0];
            String name = inputParts[1];
            String element = inputParts[2];
            int health = Integer.parseInt(inputParts[3]);
            int numberOfBadges = 0;

            Pokemon pokemon = new Pokemon(name, element, health);
            if(!trainerMap.containsKey(nameOfTrainer)){
                trainerMap.put(nameOfTrainer, new Trainer());
            }
            trainerMap.get(nameOfTrainer).getPokemonList().add(pokemon);
            trainerMap.get(nameOfTrainer).setNameOfTrainer(nameOfTrainer);

            input = scanner.nextLine();
        }

        String commandElement = scanner.nextLine();

        while (!commandElement.equals("End")){
            switch (commandElement){
                case"Fire":
                    for (var pair : trainerMap.entrySet()){
                        if(pair.getValue().getPokemonList().stream().anyMatch(
                                pokemon -> pokemon.getElement().equals("Fire")
                        )){
                            if(pair.getValue().getNumberOfBadges() == 0){
                                pair.getValue().setNumberOfBadges(1);
                            }else{
                                pair.getValue().setNumberOfBadges(pair.getValue().getNumberOfBadges() + 1);
                            }
                        }else{
                            for (Pokemon pokemon : pair.getValue().getPokemonList()){
                                pokemon.setHealth(pokemon.getHealth() - 10);
                            }
                        }
                    }
                    break;
                case"Electricity":
                    for (var pair : trainerMap.entrySet()){
                        if(pair.getValue().getPokemonList().stream().anyMatch(
                                pokemon -> pokemon.getElement().equals("Electricity")
                        )){
                            if(pair.getValue().getNumberOfBadges() == 0){
                                pair.getValue().setNumberOfBadges(1);
                            }else{
                                pair.getValue().setNumberOfBadges(pair.getValue().getNumberOfBadges() + 1);
                            }
                        }else{
                            for (Pokemon pokemon : pair.getValue().getPokemonList()){
                                pokemon.setHealth(pokemon.getHealth() - 10);
                            }
                        }
                    }

                    break;
                case"Water":
                    for (var pair : trainerMap.entrySet()){
                        if(pair.getValue().getPokemonList().stream().anyMatch(
                                pokemon -> pokemon.getElement().equals("Water")
                        )){
                            if(pair.getValue().getNumberOfBadges() == 0){
                                pair.getValue().setNumberOfBadges(1);
                            }else{
                                pair.getValue().setNumberOfBadges(pair.getValue().getNumberOfBadges() + 1);
                            }
                        }else{
                            for (Pokemon pokemon : pair.getValue().getPokemonList()){
                                pokemon.setHealth(pokemon.getHealth() - 10);
                            }
                        }
                    }
                    break;
            }
            commandElement = scanner.nextLine();
        }

        trainerMap.values().stream().sorted((p1, p2) -> Integer.compare(p2.getNumberOfBadges(), p1.getNumberOfBadges()))
                .forEach(System.out::println);
    }
}
