import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program34 {
    public static void main(String args[]) {
        System.out.println("\nEN20CS301270");
        System.out.println("NEHA KUSHWAHA\n\n");
        try {
            FileOutputStream fout = new FileOutputStream("testout.txt");
            for (int i = 1; i <= 26; i++) {
                fout.write(64 + i);
            }
            fout.close();
            System.out.println("Write operation completed.\n");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fin = new FileInputStream("testout.txt");
            int i = 0;
            System.out.print("Content of file is: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
            System.out.println("\nRead operation completed.\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
