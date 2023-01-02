package DefiningClasses.Constructors02;

public class Car {
    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String brand){
        this(brand, "unknown", -1);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }
    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
    }

    public String brand;
    public String model;
    public int horsePower;

}
