package GenericsExercise.GenericBoxОfInteger_02;
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
    @Override

    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (T value : values){
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }

        return sb.toString();
    }

}