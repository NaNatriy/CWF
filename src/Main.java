import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "the quick brown fox jumps over the lazy dog";
        String s = string.toLowerCase();
        String[] arr = s.split(" ");
        System.out.println("Слов в тексте: " + s.length());
        System.out.println("TOP10:");
        Arrays.stream(arr).collect(Collectors.toMap(s1 -> s1, s1 -> 1, Integer::sum))
                .entrySet().stream().sorted(Map.Entry.comparingByKey())
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(10)
                .forEach(System.out :: println);

    }
}
