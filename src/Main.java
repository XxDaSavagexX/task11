import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Peter", "John", "Mary");
        System.out.println(Task1.getOddIndexedNames(names));


        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        System.out.println(Task2.toUpperCaseAndSort(strings));

        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println(Task3.extractAndSortNumbers(array));


        Task4.generateRandomNumbers(123456, 25214903917L, 11L, (long) Math.pow(2, 48))
                .limit(10)
                .forEach(System.out::println);


        Stream<String> first = Stream.of("a", "b", "c");
        Stream<String> second = Stream.of("1", "2", "3");
        Task5.zip(first, second).forEach(System.out::println);
    }
}
