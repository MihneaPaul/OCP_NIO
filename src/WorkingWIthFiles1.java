/**
 * Created by Mihnea on 04.05.2017.
 */
import java.io.IOException;
import java.nio.file.*;

public class WorkingWIthFiles1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\zoo.log");
        System.out.println(Files.exists(path1));
        try {
            Files.createDirectory(Paths.get("C:\\Fast\\Files\\CreatedDirectory"));
        } catch (IOException e) {
        }
        try {
            Files.copy(Paths.get("C:\\Fast\\Files\\CreatedDirectory"), Paths.get("C:\\Fast\\CreatedDirCopy"));
        } catch (IOException e) {

        } finally {
            try {
                Files.copy(Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\zoo.log"), Paths.get("C:\\Fast\\CreatedDirCopy\\zooCopy.log"));
//                Files.move(Paths.get("C:\\Fast\\CreatedDirCopy\\zooCopy.log"), Paths.get("C:\\Fast\\CreatedDirCopy\\renamedZooCopy.log"));
            } catch (IOException f) {
            }
        }
    }
}
