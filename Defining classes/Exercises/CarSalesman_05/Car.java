package DefiningClassesExercise.CarSalesman_05;

public class Car {

    private String model;
    private String engine;
    private int weight;
    private String color;

    public Car(String model, String engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine){
        this(model, engine, -1, "n/a");
    }

    public Car(String model, String engine, String color){
        this(model, engine, -1, color);
    }

    public Car(String model, String engine, int weight){
        this(model, engine, weight, "n/a");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
