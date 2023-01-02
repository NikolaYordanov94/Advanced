package DefiningClasses.BankAccount03;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        BiFunction<BankAccount, String[], String> depositFunction = (b, arr) -> {
          int amount = Integer.parseInt(arr[2]);
          b.deposit(amount);
          return "Deposited " + amount + " to ID" + arr[1];
        };

        BiFunction<BankAccount, String[], String> getInterestFunction = (b, arr) -> {
            int years = Integer.parseInt(arr[2]);
            double interest = b.getInterest(years);
            return String.format("%.2f", interest);
        };




        while (!input.equals("End")){
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];

            switch (command){
                case"Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    break;
                case"Deposit":
                    String output = executeOnBankAccount(inputParts, bankAccounts, depositFunction);
                    System.out.println(output);
                    break;
                case"SetInterest":
                    double interestRate = Double.parseDouble(inputParts[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case"GetInterest":
                    String outputInterest = executeOnBankAccount(inputParts, bankAccounts, getInterestFunction);
                    System.out.println(outputInterest);
                    break;

            }

            input = scanner.nextLine();
        }


    }

    private static String executeOnBankAccount(String[] inputParts, Map<Integer, BankAccount> bankAccounts, BiFunction<BankAccount, String[], String> function) {

        int id = Integer.parseInt(inputParts[1]);
        BankAccount bankAccount = bankAccounts.get(id);

        if(bankAccount == null){
            return "Account does not exist";
        }

        return function.apply(bankAccount, inputParts);
    }
}
