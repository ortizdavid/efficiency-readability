package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CsvReader {

    public static void read1(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            String line = "";
            String auxArray[];
            while ((line = buffer.readLine()) != null) {
                auxArray = line.split(",");
                for (String tempStr : auxArray) {
                    System.out.println(tempStr+" ");
                }
            }
            buffer.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }

    public static void read2(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void read3(String fileName) {
        try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
            buffer.lines()
                    .flatMap(line -> java.util.Arrays.stream(line.split(",")))
                    .forEach(tempStr -> System.out.println(tempStr.trim()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read4(String fileName) {
        try {
            Pattern pattern = Pattern.compile(",");
            Files.lines(Paths.get(fileName))
                    .flatMap(pattern::splitAsStream)
                    .forEach(tempStr -> System.out.println(tempStr.trim()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
   
    
}
