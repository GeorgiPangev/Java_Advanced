import java.util.*;

public class p07CityesByContinentsAndCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, LinkedList<String>>> cityes = new LinkedHashMap<>();

        int x = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i< x; i++){

            cityes.putIfAbsent(input[0], new LinkedHashMap<>());
            cityes.get(input[0]).putIfAbsent(input[1], new LinkedList<>());
            cityes.get(input[0]).get(input[1]).add(input[2]);

            input = scanner.nextLine().split("\\s+");
        }

        cityes.entrySet().stream()
                .forEach(entry-> {
                    System.out.printf("%n%s:", entry.getKey());
                    entry.getValue().entrySet().stream()
                            .forEach((k) -> {
                                System.out.printf("%n  %s -> ", k.getKey());
                                k.getValue().stream()
                                        .forEach(d -> System.out.printf("%s, ", d));
                                });

                    });

    }
}
