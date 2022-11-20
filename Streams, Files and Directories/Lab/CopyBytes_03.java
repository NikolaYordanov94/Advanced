package StreamsFilesAndDirectories;
import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        PrintWriter printer = new PrintWriter(fileOutputStream);
        int bytes = fileInputStream.read();

        Set<Integer> delimiterTable = Set.of(10, 32);

        while (bytes != -1) {

            boolean isDelimiter = delimiterTable.contains(bytes);

            if(isDelimiter){
                printer.print((char) bytes);
            }else{
                printer.print(bytes);
            }
            bytes = fileInputStream.read();
        }
    }
}
