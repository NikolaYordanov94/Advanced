package DefiningClassesExercise.RawData_04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsFragile = new ArrayList<>();
        List<Car> carsFlamable = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split("\\s+");
            String model = inputLine[0];
            int engineSPeed = Integer.parseInt(inputLine[1]);
            int enginePower = Integer.parseInt(inputLine[2]);
            int cargoWeight = Integer.parseInt(inputLine[3]);
            String cargoType = inputLine[4];
            double tire1Pressure = Double.parseDouble(inputLine[5]);
            int tire1Age = Integer.parseInt(inputLine[6]);
            double tire2Pressure = Double.parseDouble(inputLine[7]);
            int tire2Age = Integer.parseInt(inputLine[8]);
            double tire3Pressure = Double.parseDouble(inputLine[9]);
            int tire3Age = Integer.parseInt(inputLine[10]);
            double tire4Pressure = Double.parseDouble(inputLine[11]);
            int tire4Age = Integer.parseInt(inputLine[12]);
            Car car = new Car(model, engineSPeed, enginePower, cargoWeight, cargoType, tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            if(cargoType.equals("fragile") && tire1Pressure < 1 || tire2Pressure < 1 || tire3Pressure < 1 || tire4Pressure < 1){
                carsFragile.add(car);
            }else if(cargoType.equals("flamable") && enginePower > 250){
                carsFlamable.add(car);
            }
        }

        String command = scanner.nextLine();
        if(command.equals("fragile")){
            carsFragile.forEach(System.out::println);

        }else if(command.equals("flamable")){
            carsFlamable.forEach(System.out::println);

        }
    }
}
