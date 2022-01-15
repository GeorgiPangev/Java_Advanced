import java.io.File;
import java.io.IOException;

public class p10NestsdFolders2 {

    public static int foldersCount =0;
    public static void main(String[] args) throws IOException {

        String path=  "D:\\Java\\Advanced\\Advanced" +
                "\\StreamsFilesAndDirectoris\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams";

        File root = new File(path);
        dfs(root);

        System.out.printf("%d folders", foldersCount);
    }


        public static void dfs(File file ){

            foldersCount++;
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    dfs(f);
                }
            }

            System.out.println(file.getName());
    }
}
