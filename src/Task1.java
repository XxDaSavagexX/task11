import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static String getOddIndexedNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 == 1)
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.joining(", "));
    }
}
