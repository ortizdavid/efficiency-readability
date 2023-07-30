package main;

import java.util.ArrayList;
import java.util.List;
import src.CsvReader;
import src.Factorial;
import src.StringList;

public class Main {

    public static void main(String[] args) {
        // Factorial
        System.out.println("Factorial");
        System.out.println(Factorial.factorial1(5));
        System.out.println(Factorial.factorial2(5));
        System.out.println(Factorial.factorial3(5));
        System.out.println(Factorial.factorial4(5));

        //CSV Reading
        System.out.println("CSV Reading");
        CsvReader.read1("files/client.csv");
        CsvReader.read2("files/client.csv");
        CsvReader.read3("files/client.csv");
        CsvReader.read4("files/client.csv");

        //String Transformation
        List<String> stringList = new ArrayList<>();
        stringList.add("Task 1, Done");
        stringList.add("Task 2, Pending");
        stringList.add("Task 3, In Progress");
        stringList.add("Task 4, Completed");
        StringList.transform1(stringList);
        StringList.print(stringList, 2);
        StringList.transform2(stringList);
        StringList.print(stringList, 2);
        StringList.transform3(stringList);
        StringList.print(stringList, 3);
        StringList.transform4(stringList);
        StringList.print(stringList, 4);
    }
}