package DefiningClassesExercise.Google_07;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Person> personMap = new HashMap<>();

        while (!input.equals("End")){
            String[] inputParts = input.split("\\s+");
            String personName = inputParts[0];
            if(!personMap.containsKey(personName)){
                personMap.put(personName, new Person());
            }

            switch (inputParts[1]){

                case"company":
                    String companyName = inputParts[2];
                    String department = inputParts[3];
                    double salary = Double.parseDouble(inputParts[4]);
                    Company company = new Company(companyName, department, salary);
                    personMap.get(personName).setCompany(company);
                    break;
                case"pokemon":
                    String pokemonName = inputParts[2];
                    String pokemonType = inputParts[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personMap.get(personName).getPokemonList().add(pokemon);
                    break;
                case"parents":
                    String parentName = inputParts[2];
                    String parentBirthDay = inputParts[3];
                    Parents parents = new Parents(parentName, parentBirthDay);
                    personMap.get(personName).getParentsList().add(parents);
                    break;
                case"children":
                    String childName = inputParts[2];
                    String childBirthDay = inputParts[3];
                    Children children = new Children(childName, childBirthDay);
                    personMap.get(personName).getChildrenList().add(children);
                    break;
                case"car":
                    String carModel = inputParts[2];
                    int carSpeed = Integer.parseInt(inputParts[3]);
                    Car car = new Car(carModel, carSpeed);
                    personMap.get(personName).setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }
        String searchedPerson = scanner.nextLine();
        System.out.println(searchedPerson);

        Person person = personMap.get(searchedPerson);
        System.out.println(person);
    }
}
