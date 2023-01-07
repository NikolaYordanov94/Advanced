package DefiningClassesExercise.PokemonTrainer_V2_06;

@SuppressWarnings("FieldCanBeLocal")
class Pokemon {
    private final String name;
    private final String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return this.element;
    }

    public void reduceHealth() {
        this.health -= 10;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
