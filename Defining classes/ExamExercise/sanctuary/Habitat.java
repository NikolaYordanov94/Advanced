package sanctuary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Habitat {
    private int capacity;
    List<Elephant> data;
    public int getCapacity() {
        return capacity;
    }

    public List<Elephant> getData() {
        return data;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setData(List<Elephant> data) {
        this.data = data;
    }

    public Habitat(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Elephant elephant){
        if(data.size() < capacity){
            data.add(elephant);
        }
    }
    public boolean remove(String elephantName){
        return data.removeIf(p -> p.getName().equals(elephantName));
    }

    public Elephant getElephant(String retiredPlace){
        for (Elephant elephant : data){
            if(elephant.getRetiredFrom().equals(retiredPlace)){
                return elephant;
            }
        }
        return null;
    }
    public Elephant getOldestElephant(){
        return Collections.max(data, Comparator.comparingInt(Elephant::getAge));
    }

    public Integer getAllElephants(){
        return data.size();
    }

    public String getReport(){
        StringBuilder builder = new StringBuilder("Saved elephants in the park:");
        for(Elephant elephant : data){
                builder.append("\n");
                builder.append(elephant.getName()).append(" came from: ").append(elephant.getRetiredFrom());
        }
        return builder.toString();
    }

}
