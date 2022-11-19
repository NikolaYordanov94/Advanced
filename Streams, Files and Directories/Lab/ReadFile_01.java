package StreamsFilesAndDirectories;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\Nikola\\Desktop\\Java Лекции\\Advanced September 2022\\Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        int a = 10;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int bytes = fileInputStream.read();
            while (bytes != -1) {

                    System.out.print(Integer.toBinaryString(bytes) + " ");
                bytes = fileInputStream.read();
            }
        }catch (IOException e){
        }
    }
}
