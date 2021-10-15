import java.util.ArrayDeque;
import java.util.Scanner;

public class p03DecimalToBynariConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> bynari = new ArrayDeque<>();

        int decimal = x;

        while (decimal>0){
            bynari.push(decimal%2);
            decimal /= 2;
        }

        while (!bynari.isEmpty()){
            System.out.printf("%d", bynari.pop());
        }
    }



}
