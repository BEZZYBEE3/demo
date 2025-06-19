
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ClassWork {
    public static void main(String[] args) {
        try {
            File newFile = new File("name.txt");
            Scanner read = new Scanner(newFile);

            while (read.hasNextLine()) {
                String info = read.nextLine();
                System.out.println(info);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (FileSystemNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
