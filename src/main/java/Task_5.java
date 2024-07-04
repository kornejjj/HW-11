import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        


        Supplier<Stream<String>> streamSupplier1 = () -> Stream.of("A", "B", "C");
        Supplier<Stream<String>> streamSupplier2 = () -> Stream.of("1", "2", "3", "4");
        
        
        Stream<String> result2 = zip(streamSupplier1.get(), streamSupplier2.get());
        System.out.println(result2.collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.add(firstIterator.next());
            builder.add(secondIterator.next());
        }
        return builder.build();
    }
}
