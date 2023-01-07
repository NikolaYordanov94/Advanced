package DefiningClassesExercise.PokemonTrainer_V2_06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tournament tournament = new Tournament(scanner);
        tournament.registerParticipants();
        tournament.playAllRounds();
        tournament.printResults();
    }
}
