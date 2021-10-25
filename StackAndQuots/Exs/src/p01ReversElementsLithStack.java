import java.util.*;
import java.util.stream.Collectors;

public class p01ReversElementsLithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String in = scanner.nextLine();
        Integer[] input = new Integer[in.length()];
        input = Arrays.stream(in.split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);


        for (int i = 0; i < input.length; i++) {
                stack.push(input[i]);
        }

        while (!stack.isEmpty()){


            System.out.printf("%d ", stack.pop());
        }


    }
}
