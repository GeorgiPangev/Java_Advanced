import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class p09AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int x = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < x; i++) {
            String name = scanner.nextLine();
            double[] grades =  Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            students.putIfAbsent(name, new ArrayList<>());

            for (int j = 0; j < grades.length ; j++) {
                students.get(name).add(grades[j]);
            }

        }

        students.entrySet().stream()
                .forEach(k->{
                    System.out.printf("%s is graduated with %.3f%n", k.getKey(),
                            Arrays.stream(k.getValue().toArray(new Double[0]))
                                    .mapToDouble(Double::doubleValue).average().orElse(0));
                        });
    }
}
