import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p04CopyBytes {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
            FileOutputStream outputStream = new FileOutputStream("Output.txt");
            int oneByte = inputStream.read();
            while (oneByte>=0){
                String str= String.valueOf(oneByte);

                if (!str.equals("32")&&!str.equals("10")) {
                    for (int i = 0; i < str.length(); i++) {
                        outputStream.write(str.charAt(i));
                    }

                }else {
                    outputStream.write(oneByte);
                }
                oneByte= inputStream.read();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
