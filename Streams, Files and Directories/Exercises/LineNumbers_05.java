package StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\inputLineNumbers.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\output.txt"));
        String line = br.readLine();
        int counter = 1;
        while (line != null){
            pw.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        br.close();
        pw.close();
    }
}
