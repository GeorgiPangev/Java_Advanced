import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p01ReadFile {
    public static void main(String[] args) {
        String path = "D:\\Java\\Advanced\\Advanced\\StreamsFilesAndDirectoris\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        try {
            FileInputStream streamInput = new FileInputStream(path);
            Scanner scanner = new Scanner(streamInput);

            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                System.out.println(str);

            }

            //streamInput.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }




    }
}
