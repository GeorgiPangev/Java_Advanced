import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class p03WriteFile {
    public static void main(String[] args) {
        Set<Character>arr = new HashSet<>();
        Collections.addAll(arr, ',', '.', '!', '?');
        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
            FileOutputStream outputStream = new FileOutputStream("Output.txt");
            int oneByte = inputStream.read();
            while (oneByte>=0){
                if (!arr.contains((char)oneByte)) {
                    outputStream.write((char) oneByte);
                }
                oneByte = inputStream.read();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
