package OldExams;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KAT_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> registrationPlatesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(registrationPlatesQueue::offer);

        ArrayDeque<Integer> carsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(carsStack::push);

        int registeredCars = 0;
        int days = 0;
        int leftPlates = 0;
        int leftCars = 0;

        while (!registrationPlatesQueue.isEmpty() && !carsStack.isEmpty()){
            int currentRegistrationPlates = registrationPlatesQueue.poll();
            int currentCarsToRegister = carsStack.pop();

            if(currentCarsToRegister * 2 < currentRegistrationPlates){
                registeredCars += currentCarsToRegister;
                registrationPlatesQueue.offer(currentRegistrationPlates - currentCarsToRegister * 2);
            }else if(currentCarsToRegister * 2 == currentRegistrationPlates){
                registeredCars += currentCarsToRegister;
            }else{
                registeredCars += currentRegistrationPlates / 2;
                carsStack.addLast(currentCarsToRegister - currentRegistrationPlates / 2);
            }
            days++;
        }
        System.out.printf("%d cars were registered for %d days!%n", registeredCars, days);
        if(carsStack.isEmpty() && registrationPlatesQueue.isEmpty()){
            System.out.println("Good job! There is no queue in front of the KAT!");
        }else if(carsStack.isEmpty()){
            while (!registrationPlatesQueue.isEmpty()){
                leftPlates += registrationPlatesQueue.poll();
            }
            System.out.printf("%d license plates remain!", leftPlates);
        }else{
            while (!carsStack.isEmpty()){
                leftCars += carsStack.pop();
            }
            System.out.printf("%d cars remain without license plates!", leftCars);
        }
    }
}
