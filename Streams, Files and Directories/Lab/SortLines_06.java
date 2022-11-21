package StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path)
                .sorted()
                .collect(Collectors.toList());

        Files.write(Paths.get("sorted-lines.txt"), lines);
    }
}
