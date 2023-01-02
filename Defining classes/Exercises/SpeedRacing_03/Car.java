package DefiningClassesExercise.SpeedRacing_03;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelConsumptionPer1Km;
    private int travelledDistance;

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model, double fuelAmount, double fuelConsumptionPer1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumptionPer1Km = fuelConsumptionPer1Km;
        this.travelledDistance = 0;
    }

    private double calculateRequiredFuel(int distance){
        return this.getFuelConsumptionPer1Km() * distance;
    }
    private boolean hasEnoughFuel(int distance){
        return fuelAmount >= calculateRequiredFuel(distance);
    }
    public void drive(int distance){
        if(hasEnoughFuel(distance)){
            this.fuelAmount -= calculateRequiredFuel(distance);
            this.travelledDistance += distance;
        }else{
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumptionPer1Km(double fuelConsumptionPer1Km) {
        this.fuelConsumptionPer1Km = fuelConsumptionPer1Km;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelConsumptionPer1Km() {
        return fuelConsumptionPer1Km;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }
    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, travelledDistance);
    }

}

