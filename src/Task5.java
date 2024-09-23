import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterators;
import java.util.Spliterator;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> iterator = new Iterator<>() {
            boolean switcher = true;

            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                switcher = !switcher;
                return switcher ? firstIterator.next() : secondIterator.next();
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }
}
