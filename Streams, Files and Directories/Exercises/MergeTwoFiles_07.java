package StreamsFilesAndDirectoriesExercise;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        Path firstFile = Paths.get("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\outputOne.txt");
        List<String> firstFileLines = Files.readAllLines(firstFile);

        Path secondFile = Paths.get("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\outputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(secondFile);


    }
}
