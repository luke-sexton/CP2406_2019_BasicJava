package week9;// Program describes two files
// tells you which one is newer and which one is larger

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class DebugThirteen1 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path file1 =
                fs.getPath("C:\\Users\\lukej\\OneDrive - James Cook University\\JCU\\Subjects\\Year 2\\Programming III\\Extras\\CP2406PracticalExercises\\ch13\\DebuggingExercises\\DebugData1.txt");
        Path file2 =
                fs.getPath("C:\\Users\\lukej\\OneDrive - James Cook University\\JCU\\Subjects\\Year 2\\Programming III\\Extras\\CP2406PracticalExercises\\ch13\\DebuggingExercises\\DebugData2.txt");
        try {
            BasicFileAttributes attr1 =
                    Files.readAttributes(file1, BasicFileAttributes.class);
            System.out.println("File: " + file1.getFileName());
            System.out.println("Creation time " + attr1.creationTime());
            System.out.println("Last modified time " + attr1.lastModifiedTime());
            System.out.println("Size " + attr1.size());
            BasicFileAttributes attr2 =
                    Files.readAttributes(file2, BasicFileAttributes.class);
            System.out.println("\nFile: " + file2.getFileName());
            System.out.println("Creation time " + attr2.creationTime());
            System.out.println("Last modified time " + attr2.lastModifiedTime());
            System.out.println("Size " + attr2.size());
            if (attr1.creationTime().compareTo(attr2.creationTime()) > 0) {
                System.out.println("\n" + file2.getFileName() + " was created earlier");
            } else {
                System.out.println("\n" + file2.getFileName() + " was not created earlier");
            }
            if (attr1.size() > attr2.size()) {
                System.out.println(file1.getFileName() + " is larger ");
            } else {
                System.out.println(file2.getFileName() + " is larger");
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
