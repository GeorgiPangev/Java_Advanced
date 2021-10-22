import java.util.ArrayDeque;
import java.util.Scanner;

public class p06BrolserHistoryUpgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String curentURL = null;

        ArrayDeque<String> queueOfURL = new ArrayDeque<>();

        ArrayDeque<String> urlS = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")){

            if (input.equals("back")) {

                if (!urlS.isEmpty()) {


                    queueOfURL.offer(curentURL);
                    curentURL = urlS.pop();
                    System.out.println(curentURL);
                }else {
                    System.out.println("no previous URLs");
                }


            }else if (input.equals("forward")) {

                if (queueOfURL.isEmpty()) {

                    System.out.println("no next URLs");
                }else {

                    if (curentURL!= null) {
                        urlS.push(curentURL);
                    }
                    curentURL = queueOfURL.poll();
                    System.out.println(curentURL);

                }


            }else {
                if (!queueOfURL.isEmpty()) {

                    queueOfURL.clear();

                }
                if (curentURL!= null) {
                    urlS.push(input);
                }else {
                    urlS.push(curentURL);
                }
                curentURL = input;
                System.out.println(curentURL);

            }

            input = scanner.nextLine();
        }

    }
}
