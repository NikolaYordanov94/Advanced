package StreamsFilesAndDirectories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }else{
                scanner.next();
            }
        }
    }
}
