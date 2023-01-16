package GenericsExercise.GenericCountMethodString_05;
import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> values;

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }

    public Box(){
        this.values = new ArrayList<>();
    }
    public void add(T element){
        values.add(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T temp = values.get(firstIndex);
        values.set(firstIndex, values.get(secondIndex));
        values.set(secondIndex, temp);
    }
    public int countOfGreaterItems(T elementToCompare){
        return (int) values.stream()
                .filter(elementFromBox -> elementFromBox.toString().compareTo((String) elementToCompare) > 0)
                .count();
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (T value : values){
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
}
