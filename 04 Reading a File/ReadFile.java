import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main (String[] args) {
        final String filename = "input.txt";

        // Scanner input = null;
        try(Scanner input = new Scanner(new File(filename))) {
            // input = new Scanner(new File(filename));

            String line = input.nextLine();

            System.out.println("The first line in " + filename + " is:");
            System.out.println("----------");
            System.out.println(line);
            System.out.println("----------");
        } catch(IOException ex) {
            System.out.println("Couldn't read from file...");
        // } finally {
        //     if (input != null) {
        //         input.close();
        //     }
        }
    }
}
