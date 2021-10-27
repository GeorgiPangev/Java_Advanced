import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p02BasicStackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Integer[] comands = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        for (int i = 0; i < comands[0]; i++) {
            int x = scanner.nextInt();
            stack.push(x);
        }

        for (int i = 0; i < comands[1] ; i++) {
            stack.pop();
        }
        int x = comands[2];
        if (!stack.isEmpty()){

            if (stack.contains(x)) {
                System.out.println("true");

            }else{

                int minN = Integer.MAX_VALUE;

                while (!stack.isEmpty()){
                    int curentX = stack.pop();
                    if (minN>curentX){
                        minN=curentX;
                    }
                }

                System.out.println(minN);
            }
        }


    }
}
