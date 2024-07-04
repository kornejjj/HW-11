import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Vika", "Vitalik", "Mikita", "Weronika", "Carlos", "Max", "Olha", "Susi", "Bars");

        System.out.println(filterNames(input));
    }

    static String filterNames(List<String> names) {
        return names.stream().map((i) -> names.indexOf(i) % 2 != 0 ? names.indexOf(i) + ". " + i + ", " : "")
                .collect(Collectors.joining());

    }


}
