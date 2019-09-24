package week9;// Creates a file of entrees sold at a restaurant

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DebugThirteen3 {
    public static void main(String[] args) {
        Path file =
                Paths.get("C:\\Users\\lukej\\OneDrive - James Cook University\\JCU\\Subjects\\Year 2\\Programming III\\Extras\\CP2406PracticalExercises\\ch13\\DebuggingExercises\\DebugData4.txt");
        Scanner kb = new Scanner(System.in);
        String string = "";
        String delimiter = ",";
        String entree;
        String price;
        final String QUIT = "ZZZ";
        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter first entree or " + QUIT + " to quit >> ");
            entree = kb.nextLine();
            while (!entree.equals(QUIT)) {
                System.out.print("Enter price >> ");
                price = kb.nextLine();
                string = entree + delimiter + price +
                        System.getProperty("line.separator");
                writer.write(string, 0, string.length());
                System.out.print("Enter next entree or " + QUIT + " to quit >> ");
                entree = kb.nextLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
