package DefiningClassesExercise.CarSalesman_05;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();
        List<Engine> engineList = new ArrayList<>();
        LinkedHashMap<Car, Engine> carsMap = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputEngine = scanner.nextLine();
            String[] inputEngineInfo = inputEngine.split("\\s+");
            String modelOfEngine = inputEngineInfo[0];
            String engine = inputEngineInfo[1];

            Engine engineObj = null;
            switch (inputEngineInfo.length){
                case 2:
                    engineObj = new Engine(modelOfEngine, engine);
                    break;

                case 3:
                    if(isString(inputEngineInfo[2])){
                        String efficiency = inputEngineInfo[2];
                        engineObj = new Engine(modelOfEngine, engine, efficiency);
                    }else{
                        int displacement = Integer.parseInt(inputEngineInfo[2]);
                        engineObj = new Engine(modelOfEngine, engine, displacement);
                    }
                    break;

                case 4:
                    int displacement = Integer.parseInt(inputEngineInfo[2]);
                    String efficiency = inputEngineInfo[3];
                    engineObj = new Engine(modelOfEngine, engine, displacement, efficiency);
                    break;
            }
            engineList.add(engineObj);
        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String inputCar = scanner.nextLine();
            String[] inputCarInfo = inputCar.split("\\s+");
            String model = inputCarInfo[0];
            String engine = inputCarInfo[1];

            Car car = null;
            switch (inputCarInfo.length){
                case 2:
                    car = new Car(model, engine);
                    break;

                case 3:
                    if(isString(inputCarInfo[2])){
                        String color = inputCarInfo[2];
                        car = new Car(model, engine, color);
                    }else{
                        int weight = Integer.parseInt(inputCarInfo[2]);
                        car = new Car(model, engine, weight);
                    }
                    break;

                case 4:
                    int weight = Integer.parseInt(inputCarInfo[2]);
                    String color = inputCarInfo[3];
                    car = new Car(model, engine, weight, color);
                    break;
            }
            carList.add(car);

        }
        for(Car car : carList){
            for (Engine engineObj : engineList){
                if (car.getEngine().equals(engineObj.getModelOfEngine())){
                    carsMap.put(car, engineObj);
                }
            }
        }
        for(var pair : carsMap.entrySet()){
            if(pair.getValue().getDisplacement() == -1 && pair.getKey().getWeight() == -1){
                System.out.printf("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: n/a%nColor: %s%n",
                        pair.getKey().getModel(), pair.getKey().getEngine(), pair.getValue().getPower()
                        , pair.getValue().getEfficiency()
                        , pair.getKey().getColor());
            }else if(pair.getKey().getWeight() == -1){
                System.out.printf("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: n/a%nColor: %s%n",
                        pair.getKey().getModel(), pair.getKey().getEngine(), pair.getValue().getPower(),
                        pair.getValue().getDisplacement(), pair.getValue().getEfficiency(), pair.getKey().getColor());

            }else if(pair.getValue().getDisplacement() == -1){
                System.out.printf("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: %d%nColor: %s%n",
                        pair.getKey().getModel(), pair.getKey().getEngine(), pair.getValue().getPower()
                        , pair.getValue().getEfficiency(), pair.getKey().getWeight()
                        , pair.getKey().getColor());
            }else{
                System.out.printf("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: %d%nColor: %s%n",
                        pair.getKey().getModel(), pair.getKey().getEngine(), pair.getValue().getPower(),
                        pair.getValue().getDisplacement(), pair.getValue().getEfficiency(), pair.getKey().getWeight()
                        , pair.getKey().getColor());
            }
        }
    }

    public static boolean isString(String str){
        if(str.charAt(0) < 48 || str.charAt(0) > 57){
            return true;
        }
        return false;
    }
}
