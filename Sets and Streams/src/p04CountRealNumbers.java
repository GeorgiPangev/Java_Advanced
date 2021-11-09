import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04CountRealNumbers {
    public static void main(String[] args) {
        Map<Double, Integer> numbers = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        double[] arrOfDoubles = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (int i = 0; i < arrOfDoubles.length; i++) {

            numbers.putIfAbsent(arrOfDoubles[i],0);
            numbers.put(arrOfDoubles[i], numbers.get(arrOfDoubles[i])+1);

        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {

            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
