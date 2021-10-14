import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class p02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] tockens = scanner.nextLine()
                .split("\\s+");

        for (int i = 0; i < tockens.length; i++) {

            if (Character.isDigit(tockens[i].charAt(0))&& stack.isEmpty()) {

                stack.push(Integer.parseInt((tockens[i])));
                continue;

            }else {

                int x = stack.pop();
                int y = Integer.parseInt(tockens[++i]);
                int result = tockens[i-1].equals("+")
                    ? x+y
                    : x-y;

               stack.push(result);

            }

        }

        System.out.println(stack.pop());



    }
}
