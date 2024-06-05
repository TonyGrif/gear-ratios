import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GearRatios {
    public static void main (String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/resources/example.txt";
        Scanner reader = null;

        try {
            reader = new Scanner(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.printf("File not found at %s%n", filePath);
            System.exit(-1);
        }
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
    }
}
