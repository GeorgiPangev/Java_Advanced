import java.util.ArrayDeque;
import java.util.Scanner;

public class p01BrawserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urlS = new ArrayDeque<>();

        String comand = scanner.nextLine();

        String curentUrl = null;

        while (!comand.equals("Home")){
            if (comand.equals("back")) {
                if (urlS.isEmpty()){
                    System.out.println("no previous URLs");
                    comand = scanner.nextLine();
                    continue;
                }else {
                    curentUrl = urlS.pop();


                }

            }else {
                if (curentUrl != null) {
                    urlS.push(curentUrl);
                }
                curentUrl = comand;
            }
            System.out.println(curentUrl);
            comand = scanner.nextLine();
        }

    }
}
