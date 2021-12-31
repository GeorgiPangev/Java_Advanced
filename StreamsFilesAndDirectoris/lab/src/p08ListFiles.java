import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class p08ListFiles {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Java\\Advanced\\Advanced\\StreamsFilesAndDirectoris\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        File file = new File("D:\\Java\\Advanced\\Advanced\\StreamsFilesAndDirectoris\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");



            File[] files = file.listFiles();


        for (File f: files) {
            if (f.isFile()) {

                System.out.println(f.getName() + " -> " + f.length());

            }
        }

    }
}
