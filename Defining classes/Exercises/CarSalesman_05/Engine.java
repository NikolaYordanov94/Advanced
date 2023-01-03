package DefiningClassesExercise.CarSalesman_05;

public class Engine {
    private String modelOfEngine;
    private String power;
    private int displacement;
    private String efficiency;

    public Engine(String modleOfEngine, String power, int displacement, String efficiency) {
        this.modelOfEngine = modleOfEngine;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String modelOfEngine, String power){
        this(modelOfEngine, power, -1, "n/a");
    }

    public Engine(String modelOfEngine, String power, int displacement){
        this(modelOfEngine, power, displacement, "n/a");
    }

    public Engine(String modelOfEngine, String power, String efficiency){
        this(modelOfEngine, power, -1, efficiency);
    }


    public void setModelOfEngine(String modelOfEngine) {
        this.modelOfEngine = modelOfEngine;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModelOfEngine() {
        return modelOfEngine;
    }

    public String getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

}
