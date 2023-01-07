package DefiningClassesExercise.Google_07;

public class Car {
    private String carModel;
    private int carSpeed;

    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
    @Override
    public String toString(){
        return String.format("%s %d", carModel, carSpeed);
    }

}
