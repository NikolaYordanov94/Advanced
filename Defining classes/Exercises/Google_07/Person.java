package DefiningClassesExercise.Google_07;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Parents> parentsList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;

    public Person() {
        parentsList = new ArrayList<>();
        childrenList = new ArrayList<>();
        pokemonList = new ArrayList<>();
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setParentsList(List<Parents> parentsList) {
        this.parentsList = parentsList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company: ").append("\n");
        if(company != null){
            builder.append(company.toString()).append("\n");
        }
        builder.append("Car: ").append("\n");
        if(car != null){
            builder.append(car.toString()).append("\n");
        }
        builder.append("Pokemon: ").append("\n");
        for (Pokemon pokemon : pokemonList){
            builder.append(pokemon.toString()).append("\n");
        }
        builder.append("Parents: ").append("\n");
        for (Parents parents : parentsList){
            builder.append(parents.toString()).append("\n");
        }
        builder.append("Children: ").append("\n");
        for (Children children : childrenList){
            builder.append(children.toString()).append("\n");
        }
        return builder.toString();
    }
}
