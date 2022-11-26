package StreamsFilesAndDirectoriesExercise;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        FileReader fr = new FileReader("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\input.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\Exercises Resources\\output.txt"));
        int oneByte = fr.read();
        while (oneByte >= 0){
            char symbol = (char) oneByte;
            if(isVowel(symbol)){
                vowels++;
            }else if(isPunctuational(symbol)){
                punctuation++;
            }else if(!Character.isWhitespace(symbol)){
                consonants++;
            }
            oneByte = fr.read();
        }
        fr.close();
        pw.println("Vowels: " + vowels);
        pw.println("Consonants: " + consonants);
        pw.println("Punctuation: " + punctuation);
        pw.close();
    }
    private static boolean isPunctuational (char symbol){
        return symbol == '.' || symbol == '!' || symbol == ',' || symbol == '?';
    }
    private static boolean isVowel(char symbol){
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
