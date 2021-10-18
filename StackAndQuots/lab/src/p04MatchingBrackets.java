import java.util.ArrayDeque;
import java.util.Scanner;

public class p04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {

                stack.push(i);

            }else if (ch == ')'){

                int start = stack.pop();

                System.out.println(input.substring(start, i+1));
            }
        }
    }
}
