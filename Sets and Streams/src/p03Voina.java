import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds--> 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int firstCart = firstDeck.iterator().next();
            firstDeck.remove(firstCart);
            int secondCart = secondDeck.iterator().next();
            secondDeck.remove(secondCart);

            if (firstCart > secondCart) {

                firstDeck.add(firstCart);
                firstDeck.add(secondCart);

            } else if (secondCart > firstCart) {

                secondDeck.add(firstCart);
                secondDeck.add(secondCart);

            }
        }

            if (secondDeck.size() < firstDeck.size()) {
                System.out.println("First Player Win!");

            }else if (secondDeck.size()>firstDeck.size()) {

                System.out.println("Second Player Win!");

            }else {
                System.out.println("Draw!");
            }

        }
    }

