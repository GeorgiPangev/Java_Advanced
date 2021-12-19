import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class p04ExtractInteger {
    public static void main(String[] args) {

        Set<Integer> arr = new LinkedHashSet<>();

        try (FileInputStream inputStream = new FileInputStream("input.txt")) {

            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()){
            // System.out.printf(scanner.next());
            if (scanner.hasNextInt()) {
               arr.add(scanner.nextInt());
                //System.out.println(scanner.nextInt());

            }
            scanner.next();
        }



            inputStream.close();

        }catch (IOException x){
            x.printStackTrace();
        }

        arr.stream().forEach(i-> System.out.println(i));
    }
}
