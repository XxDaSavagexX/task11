import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> toUpperCaseAndSort(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }
}
