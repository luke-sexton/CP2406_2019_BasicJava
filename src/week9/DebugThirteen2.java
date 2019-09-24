package week9;// Program reads in a file of phone numbers without area codes
// inserts "(312) " in front of each phone number
// and produces an output file with the new complete phone numbers

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DebugThirteen2 {
    public static void main(String[] args) {
        Path fileIn =
                Paths.get("C:\\Users\\lukej\\OneDrive - James Cook University\\JCU\\Subjects\\Year 2\\Programming III\\Extras\\CP2406PracticalExercises\\ch13\\DebuggingExercises\\DebugData3.txt");
        Path fileOut =
                Paths.get("C:\\Users\\lukej\\OneDrive - James Cook University\\JCU\\Subjects\\Year 2\\Programming III\\Extras\\CP2406PracticalExercises\\ch13\\DebuggingExercises\\DebugData3New.txt");
        String areaCode = "(312) ";
        String phone;
        InputStream input;
        OutputStream output;
        try {
            input = Files.newInputStream(fileIn);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            output = Files.newOutputStream(fileOut);
            phone = reader.readLine();

            while (phone != null) {
                phone = areaCode + phone + System.getProperty("line.separator");
                byte[] phoneBytes = phone.getBytes();
                output.write(phoneBytes);
                phone = reader.readLine();
            }
            input.close();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

