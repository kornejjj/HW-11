import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Vika", "Vitalik", "Mikita", "Weronika", "Carlos", "Max", "Olha", "Susi", "Bars");

        AtomicInteger number = new AtomicInteger(0);
        String output = input.stream()
                .map(name -> {
                    if ((number.get() % 2) != 0) {
                        return number.getAndIncrement() + ". " + name;
                    } else {
                        number.getAndIncrement();
                        return "";
                    }
                })
                .filter(name -> !name.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println(output);

    }


}
