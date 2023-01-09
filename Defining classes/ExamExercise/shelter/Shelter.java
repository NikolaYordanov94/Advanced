package shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Animal> getData() {
        return data;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setData(List<Animal> data) {
        this.data = data;
    }

    public void add(Animal animal){
        if(data.size() < capacity){
            data.add(animal);
        }
    }

    public boolean remove(String name){
        for (Animal singleAnimal : data){
            if(singleAnimal.getName().equals(name)){
                data.remove(singleAnimal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker){
        for (Animal oneAnimal : data){
            if(oneAnimal.getName().equals(name) && oneAnimal.getCaretaker().equals(caretaker)){
                return oneAnimal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal(){
        return Collections.max(data, Comparator.comparingInt(Animal::getAge));
    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics(){
        StringBuilder animalFinalStatisticsBuilder = new StringBuilder();
        animalFinalStatisticsBuilder.append("The shelter has the following animals:").append("\n");
        for (Animal singleAnimal : data){
            animalFinalStatisticsBuilder.append(singleAnimal.getName()).append(" ")
                    .append(singleAnimal.getCaretaker()).append(System.lineSeparator());
        }
        return animalFinalStatisticsBuilder.toString();
    }

}
