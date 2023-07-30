package src;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class StringList {

    public static void transform1(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
           String original = stringList.get(i);
           String upperCase = original.toUpperCase();
           String replace = upperCase.replace(",", " ");
           String result = replace;
           stringList.set(i, result);
        }
    }

    public static void transform2(List<String> stringList) {
        ListIterator<String> iterator = stringList.listIterator();
        while (iterator.hasNext()) {
            String original = iterator.next();
            String upperCase = original.toUpperCase();
            String replace = upperCase.replace(",", " ");
            iterator.set(replace);
        }
    }

    public static void transform3(List<String> stringList) {
        List<String> transformedList = new ArrayList<>();
        stringList.forEach(s -> transformedList.add(s.toUpperCase().replace(",", " ")));
        stringList.clear();
        stringList.addAll(transformedList);
    }

    public static void transform4(List<String> stringList) {
        var transformedList = stringList.stream()
            .map(str -> str.toUpperCase().replace(",", " ")).collect(Collectors.toList());
        stringList.clear();
        stringList.addAll(transformedList);
    }

    public static void transform5(List<String> stringList) {
        stringList.replaceAll(s -> s.toUpperCase().replace(",", " "));
    }

    public static void print(List<String> stringList, int trans) {
        System.out.println("\nTransformation "+ trans);
        for (String str : stringList) {
            System.out.println(str);
        }
    }
    
}
