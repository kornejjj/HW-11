import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Vika", "Vitalik", "Mikita", "Weronika", "Carlos", "Max", "Olha", "Susi", "Bars");

        System.out.println(filterNames(input));
    }

    static String filterNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i) + ", ")
                .collect(Collectors.joining());
    }
}

