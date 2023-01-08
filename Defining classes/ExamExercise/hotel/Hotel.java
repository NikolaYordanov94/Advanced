package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    List<Person> roaster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roaster = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Person> getRoaster() {
        return roaster;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoaster(List<Person> roaster) {
        this.roaster = roaster;
    }

    public void add(Person person){
        if (roaster.size() < capacity){
            roaster.add(person);
        }
    }

    public boolean remove(String name){
        for (Person person : roaster){
            if(person.getName().equals(name)){
                roaster.remove(person);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown){
        for(Person person : roaster){
            if (person.getName().equals(name) && person.getHometown().equals(hometown)){
                return person;
            }
        }
        return null;
    }

    public int getCount(){
        return roaster.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The people in the hotel ").append(name).append(" ").append("are:").append("\n");
        for (Person person : roaster){
            builder.append(person).append("\n");
        }
        return builder.toString();
    }
}
