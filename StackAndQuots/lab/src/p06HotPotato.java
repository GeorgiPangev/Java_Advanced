import java.util.*;
import java.util.stream.Collectors;

public class p06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> kids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        int x = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kidsOut = new ArrayDeque<>();

        int counter = 0;

        while (kids.size()>1){

            for (int i = 0; i < kids.size(); i++) {

                counter++;

                if (counter == x&& kids.size()>1) {
                    String kid = kids.get(i);
                    kidsOut.offer(kid);

                    kids.remove(kid);
                    counter=0;
                    --i;

                    System.out.println("Removed "+ kid);


                }else if (kids.size() == 1) {

                    kidsOut.offer(kids.get(0));
                    kids.remove(kids.get(i));
                }


            }

        }

       ArrayDeque<String> kidsToPrint = new ArrayDeque<>();
        while (!kidsOut.isEmpty()){

            kidsToPrint.push(kidsOut.poll());

        }



        System.out.println("Last is "+ kidsToPrint.pop());

    }
}
