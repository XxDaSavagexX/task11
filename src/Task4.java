import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generateRandomNumbers(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
