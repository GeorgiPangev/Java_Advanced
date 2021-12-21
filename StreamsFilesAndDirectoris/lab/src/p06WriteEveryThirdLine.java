import java.io.*;

public class p06WriteEveryThirdLine {
    public static void main(String[] args) throws IOException{

        try {

            BufferedReader in = new BufferedReader(new FileReader("input.txt"));

            PrintWriter out = new PrintWriter(new FileWriter("OutpitIn3.txt"));

            String line = in.readLine();

            int count = 0;

            while (line != null){

                count++;
                if (count%3==0) {

                    out.println(line);
                }
                line= in.readLine();
            }

            in.close();
            out.close();


        }finally {

        //catch (IOException x){

            //x.printStackTrace();

        }
    }
}
