import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File obj = new File("myfile.txt");
            obj.createNewFile();
            System.out.println("File Created! " + obj.exists());
            FileWriter writer = new FileWriter(obj);
            Scanner read = new Scanner(obj);
            read.hasNextLine();

            InputStream in = new InputStream() {

                @Override
                public int read() throws IOException {
                    System.out.println("File not found");
                    return 0;
                }
            };
            in.read();
            writer.write("hi. i am high.");
            System.out.println("File Created! " + obj.getName());
        } catch(IOException e){
            System.out.println("file not found ");
            e.printStackTrace();
        }
    }
}
