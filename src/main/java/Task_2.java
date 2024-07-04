import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Task_2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Vika", "Vitalik", "Mikita", "Weronika", "Carlos", "Max", "Olha", "Susi", "Bars");


        List<String> output = input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(output);

    }

}
