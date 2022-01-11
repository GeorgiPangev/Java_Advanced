import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class p09NestedFolders {
    public static void main(String[] args) throws IOException {

       // Path path = Paths.get(;



        File root = new File("D:\\Java\\Advanced\\Advanced\\" +
                "StreamsFilesAndDirectoris\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams");

        ArrayDeque<File> folders  = new ArrayDeque<>();
        folders.offer(root);

        int counter = 0;
        while (!folders.isEmpty()){
            File curent = folders.poll();
            File[] curentNested = curent.listFiles();
            for (File file : curentNested) {

                if (file.isDirectory()) {
                    folders.offer(file);
                }


            }
            counter++;
            System.out.println(curent.getName());
        }
        System.out.printf("%d Folders", counter);

    }
}
