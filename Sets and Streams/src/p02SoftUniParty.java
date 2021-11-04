import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class p02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> gests = new TreeSet<>();
        //Set<String> vip = new LinkedHashSet<>();

        String gest = scanner.nextLine();

        while (!gest.equals("PARTY")){
            gests.add(gest);
            gest = scanner.nextLine();
        }

        gest = scanner.nextLine();
        while (!gest.equals("END")){
            gests.remove(gest);

            gest = scanner.nextLine();
        }

        System.out.println(gests.size());
        System.out.println(gests.stream()
                .collect(Collectors.joining(System.lineSeparator())));


    }
}
