import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(12, 16, 19, -9);
        Stream<Integer> second = Stream.of(12);

        zip(first, second).forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Stream.iterate(0, i -> firstIterator.hasNext() && secondIterator.hasNext(), i -> i + 1)
                .forEach(i -> {
                    resultList.add(firstIterator.next());
                    resultList.add(secondIterator.next());
                });
        return resultList.stream();
    }
}
