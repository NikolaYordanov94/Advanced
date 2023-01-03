package DefiningClassesExercise.PokemonTrainer_06;
import java.util.ArrayList;
import java.util.List;

public class Trainer {
    String nameOfTrainer;
    int numberOfBadges;
    List<Pokemon> pokemonList;

    public Trainer(String name, int numberOfBadges, List<Pokemon> pokemonList) {
        this.nameOfTrainer = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemonList = pokemonList;
    }
    public Trainer(){
        this.nameOfTrainer = "";
        this.numberOfBadges = 0;
        this.pokemonList = new ArrayList<>();
    }

    public String getNameOfTrainer() {
        return nameOfTrainer;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setNameOfTrainer(String nameOfTrainer) {
        this.nameOfTrainer = nameOfTrainer;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", nameOfTrainer, numberOfBadges, pokemonList.size());
    }
}
