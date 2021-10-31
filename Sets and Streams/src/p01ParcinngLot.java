import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class p01ParcinngLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parcing = new LinkedHashSet<>();

        String comand = scanner.nextLine();
        
        while (!comand.equals("END")){
            String number = comand.substring(comand.indexOf(", ")+2);
            if (comand.contains("IN")) {

                parcing.add(number);


            }else {
                parcing.remove(number);
            }
            comand = scanner.nextLine();


        }

        if (!parcing.isEmpty()) {
            System.out.println(parcing.stream()
                    .collect(Collectors.joining(System.lineSeparator())));
        }else{
            System.out.println("Parking Lot is Empty");
        }
    }
}
