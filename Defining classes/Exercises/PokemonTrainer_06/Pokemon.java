package DefiningClassesExercise.PokemonTrainer_06;

public class Pokemon {
    String name;
    String element;
    int health;

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

}