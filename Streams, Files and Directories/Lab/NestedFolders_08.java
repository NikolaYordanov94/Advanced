package StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders_08 {
    public static void main(String[] args) {
        String address = "C:\\Users\\Nikola\\Desktop\\Java Projects\\Advanced-Java-September-2022\\resources\\input.txt";

        File root = new File(address);
        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            File file = queue.poll();

                File[] files = file.listFiles();
                if(files != null){
                    for(File f : files){
                        System.out.println(f.getName());
                    }
                }
        }
    }
}
