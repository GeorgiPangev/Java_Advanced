import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p08ProductShop {
    public static void main(String[] args) {
        Map<String, TreeMap<String, Double>> shops = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        String[] comand = scanner.nextLine().split(",\\s+");

        while (!comand[0].equals("Revision")){

            shops.putIfAbsent(comand[0], new TreeMap<>());
            if (shops.get(comand[0]).containsKey(comand[1])) {
                double x = shops.get(comand[0]).get(comand[1]).doubleValue();
                shops.get(comand[0]).replace(comand[1], shops.get(comand[0]).get(comand[1]).doubleValue(),
                        Double.parseDouble(comand[2]));
            }else {
                shops.get(comand[0]).put(comand[1], Double.parseDouble(comand[2]));
            }

            comand = scanner.nextLine().split(", ");
        }

        shops.entrySet().stream()
                .forEach((k)-> {
                    System.out.printf("%s ->%n", k.getKey());
                            k.getValue().entrySet().stream()
                                    .forEach((x)->{
                                        System.out.printf("Product: %s, Price: %.1f%n",
                                                x.getKey(),x.getValue());
                                    });


                });

    }
}
