package StreamsFilesAndDirectoriesExercise;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        Scanner wordScanner = new Scanner(new FileReader("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\words.txt"));

        String [] wordsToSearch = wordScanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : wordsToSearch){
            map.put(word, 0);
        }
        Scanner fileScanner = new Scanner(new FileReader("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\text.txt"));

        String singleWord = fileScanner.next();

        while (fileScanner.hasNext()){
            if(map.containsKey(singleWord)){
                int occurrences = map.get(singleWord);
                occurrences++;
                map.put(singleWord, occurrences);
            }
            singleWord = fileScanner.next();
        }
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\result.txt"));
        map.entrySet().stream().forEach(entry -> pw.printf("%s - %d%n", entry.getKey(), entry.getValue()));
        fileScanner.close();
        wordScanner.close();
        pw.close();
    }
}
