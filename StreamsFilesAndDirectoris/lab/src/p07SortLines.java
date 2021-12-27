import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class p07SortLines {
    public static void main(String[] args) throws IOException {

        Path inPath =
                Paths.get("input.txt");

        Path outPath = Paths.get("Output.txt");



        List<String> lines = Files.readAllLines(inPath).stream()
                .sorted((x, y)->x.compareTo(y))
                .collect(Collectors.toList());

        Files.write(outPath, lines);




    }

}
