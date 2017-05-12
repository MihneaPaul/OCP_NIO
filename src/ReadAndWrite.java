/**
 * Created by Mihnea on 04.05.2017.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) {

        // OLD WAY

        Path path = Paths.get("C:\\Fast\\CreatedDirCopy\\zooCopy.log");
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-16"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (IOException e) {
            // Handle exception
        }
//        List<String> data = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Fast\\CreatedDirCopy\\renamedZooCopy.log"), Charset.forName("UTF-16"))) {
            writer.write("Si animalele au suflet!");
        } catch (IOException e) {
        }


        // NEW WAY
        try {
            final List<String> lines = Files.readAllLines(path, Charset.forName("UTF-16"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
        }

    }
}


