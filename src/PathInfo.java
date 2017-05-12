/**
 * Created by Mihnea on 04.05.2017.
 */
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;


public class PathInfo {
    public static void printPathInformation(Path path) {
//        Path path = Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\zoo.log");
        System.out.println("The Path name is: " + path);
        System.out.println();

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i + " is: " + path.getName(i));
//            System.out.println(path.getName(i));
        }
        System.out.println();
        System.out.println("Name count is: " + path.getNameCount());
        System.out.println();

        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        System.out.println("Parent is: " + path.getParent());
        System.out.println();

        System.out.println("Path is Absolute? " + path.isAbsolute());
        System.out.println("Absolute path is: " + path.toAbsolutePath());
    }

    public static void main(String[] args) {
        printPathInformation(Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\zoo.log"));
        System.out.println("\n");
        printPathInformation(Paths.get("OCP_NIO\\zoo.log"));
        System.out.println("\n");

        Path path1 = Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\zoo.log");
        Path path2 = Paths.get("C:\\Users\\Mihnea\\IdeaProjects\\OCP_NIO\\\\exemplu\\birds.log");
        Path path3 = Paths.get("cats.log");
        System.out.println("Path is: " + path1);
        System.out.println();
        System.out.println("Subpath from 0 to 3 is: " + path1.subpath(0, 3));
        System.out.println("Subpath from 1 to 3 is: " + path1.subpath(1, 3));
        System.out.println("Subpath from 1 to 2 is: " + path1.subpath(1, 2));
        System.out.println();
        System.out.println(path1.relativize(path2));
        System.out.println(path1.resolve(path3));
        System.out.println();

        try {
            System.out.println(path1.toRealPath());
            System.out.println(path2.toRealPath());
        } catch (IOException e) {
        }
    }
}
