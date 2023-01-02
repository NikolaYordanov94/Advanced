package DefiningClasses.CarInfo01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            String brand = carInfo[0];
            String model = carInfo[1];
            int horsePower = Integer.parseInt(carInfo[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            System.out.printf("The car is: %s %s - %d HP.%n", car.brand, car.model, car.horsePower);
        }
    }
}
