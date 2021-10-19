import java.util.ArrayDeque;
import java.util.Scanner;

public class p05Printer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String comand = scanner.nextLine();

        while (!comand.equals("print")){
            if (comand.equals("cancel")) {

                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s%n", queue.poll());
                }

            }else{
                queue.offer(comand);
            }
            comand= scanner.nextLine();
        }

        while (!queue.isEmpty()){

            System.out.println(queue.poll());
        }
    }
}
