import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p05AverageStudentGrade {
    public static void main(String[] args) {


        Map<String, ArrayList<Double>> students = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            students.putIfAbsent(input[0], new ArrayList<>());
            //students.put(input[0], .add(Double.parseDouble(input[1])));
             students.get(input[0]).add(Double.parseDouble(input[1]));
        }

        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            System.out.printf("%s -> ",entry.getKey());


            for (double grade: entry.getValue()) {

                System.out.printf("%.2f ", grade);
            }

            System.out.printf("(avg: %.2f)%n", entry.getValue()
                    .stream()
                    .collect(Collectors.averagingDouble(x->x)));

        }

    }
}
