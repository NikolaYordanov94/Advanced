package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private String material;
    private int capacity;
    List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Egg> getData() {
        return data;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setData(List<Egg> data) {
        this.data = data;
    }

    public void addEgg(Egg egg){
        if (capacity > data.size()){
            data.add(egg);
        }
    }

    public boolean removeEgg(String color){
        for (Egg egg : data){
            if(egg.getColor().equals(color)){
                data.remove(egg);
                return true;
            }
        }
        return false;
    }

    public Egg getStrongestEgg(){
        return data.stream().max(Comparator.comparingInt(Egg::getStrength)).orElse(null);
    }

    public Egg getEgg(String color){
        for(Egg egg : data){
            if(egg.getColor().equals(color)){
                return egg;
            }
        }
        return null;
    }

    public int getCount(){
        return data.size();
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append(material).append(" basket contains:").append("\n");
        for (Egg egg : data){
            builder.append(egg).append("\n");
        }
        return builder.toString();
    }
}
